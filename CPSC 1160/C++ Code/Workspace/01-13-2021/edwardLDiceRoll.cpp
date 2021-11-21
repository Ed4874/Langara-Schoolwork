/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date: January 13, 2021
 *Purpose: This program will play a game of craps and display the results to the player.*/

#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <math.h>
using namespace std;

//diceOne and diceTwo will each generate random numbers between 1 and 6 
int diceOne() {
    int number = rand() % 6 + 1;
    return number;
}

int diceTwo() {
    int number = rand() % 6 + 1;
    return number;
}

/*secondaryRun will continue to run via recursion until either the randomNumber is equal to the previous number or 7,
 *and announce the results based on the number generated.*/
void secondaryRun(int randomNumber, int previousNumber) {
    if (randomNumber == previousNumber) {
        cout << "You rolled " << randomNumber << ". You Win!." << endl;
    }
    else if (randomNumber == 7) {
        cout << "You rolled " << randomNumber << ". You Lose." << endl;
    }
    else if (randomNumber != (7 && previousNumber)) {
        randomNumber = diceOne() + diceTwo();
        secondaryRun(randomNumber, previousNumber);
    }
}
/*primaryRun will check if the randomNumber is equal to any of the numbers listed below. If it equals
 *7 or 11, the player wins, while if they roll 2, 3, or 12, the player loses. If the game neither wins
 *or loses, primaryRun will call secondaryRun.*/
void primaryRun(int randomNumber, int previousNumber) {
    if (randomNumber == 7 || randomNumber == 11) {
        cout << "You rolled " << randomNumber << ". You Win!." << endl;
    }
    else if (randomNumber == 2 || randomNumber == 3 || randomNumber == 12) {
        cout << "You rolled " << randomNumber << ". You Lose." << endl;
    }
    else if (randomNumber != (7 && 11 && 2 && 3 && 12)) {
        previousNumber = randomNumber;
        randomNumber = diceOne() + diceTwo();
        secondaryRun(randomNumber, previousNumber);
    }
}

/*The main method will first call srand(time(NULL)) to generate a random seed using time. Since time
 *is forever changing, srand will generate a different number each time. The main method will then
 *call diceOne and diceTwo and add the result to create randomNumber. Finally, it will call primaryRun.*/
int main() {
    srand(time(NULL));
    int randomNumber, previousNumber;

    randomNumber = diceOne() + diceTwo();
    primaryRun(randomNumber, previousNumber);
}