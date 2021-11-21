#include <iostream>
#include <time.h>
using namespace std;

int diceOne() {
    int number = rand() % 6 + 1;
    return number;
}

int diceTwo() {
    int number = rand() % 6 + 1;
    return number;
}

int main() {
    srand(time(NULL));
    int previousNumber;
    int randomNumber = diceOne() + diceTwo();
    int winCount, lossCount;

    for (int i = 0; i < 1000000; i++) {
        if (randomNumber == 7 || randomNumber == 11 || randomNumber == previousNumber) {
            winCount++;
        }
        else if (randomNumber == 2 || randomNumber == 3 || randomNumber == 12) {
            lossCount++;
        }
        else if (randomNumber != (7 && 11 && 2 && 3 && 12)) {
            previousNumber = randomNumber;
            randomNumber = diceOne() + diceTwo();
            if (randomNumber == previousNumber) {
                winCount++;
            }
            else if (randomNumber == 7) {
                lossCount++;
            }
            else if (randomNumber != (7 && previousNumber)) {
                main();
            }
        }
    }
    cout << winCount << endl;
    cout << lossCount << endl;
}