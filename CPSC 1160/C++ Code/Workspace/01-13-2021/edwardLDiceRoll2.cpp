/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date: January 13, 2021
 *Purpose: This program will play 1000000 games of craps and display the percentage of games won.*/

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
 *and add to winCount or lossCount based on the result.*/
bool secondaryRun(int randomNumber, int previousNumber) {
    bool result;
    if (randomNumber == previousNumber) {
        result = true;
    }
    else if (randomNumber == 7) {
        result = false;
    }
    else if (randomNumber != (7 && previousNumber)) {
        randomNumber = diceOne() + diceTwo();
        result = secondaryRun(randomNumber, previousNumber);
    }
    return result;
}

/*primaryRun will check if the randomNumber is equal to any of the numbers listed below. If it equals
 *7 or 11, the player wins, and the result is tallied using winCount. If they roll 2, 3, or 12, the player loses,
 *and the result is tallied using lossCount. If the game neither wins or loses, primaryRun will call secondaryRun.*/
bool primaryRun(int randomNumber, int previousNumber) {
    bool result;
    if (randomNumber == 7 || randomNumber == 11) {
        result = true;
    }
    else if (randomNumber == 2 || randomNumber == 3 || randomNumber == 12) {
        result = false;
    }
    else if (randomNumber != (7 && 11 && 2 && 3 && 12)) {
        previousNumber = randomNumber;
        randomNumber = diceOne() + diceTwo();
        result = secondaryRun(randomNumber, previousNumber);
    }
    return result;
}

/*The main method will first call srand(time(NULL)) to generate a random seed using time. Since time
 *is forever changing, srand will generate a different number each time. The main method will then
 *start a for loop that loops 1000000 times. Within the loop, the program will call diceOne and diceTwo 
 *and add the result to create randomNumber. Next, it will call primaryRun. When the loop is completed,
 *the program will display the percentage of games won.*/
int main() {
    srand(time(NULL));
    int randomNumber, previousNumber;
    static double winCount, lossCount;

    for (int i = 1; i <= 1000000; i++) {
        randomNumber = diceOne() + diceTwo();
        if (primaryRun(randomNumber, previousNumber)) {
            winCount++;
        }
        else {
            lossCount++;
        }
    }
    cout << "Games won: " << round(winCount/1000)/10 << "%" << endl;
}