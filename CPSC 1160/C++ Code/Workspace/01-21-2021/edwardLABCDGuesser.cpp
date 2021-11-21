/*Student Name: Edward Lu
 *Student Number: 100359822
 *Due Date: January 28, 2021
 *Purpose: This program will take a user's input and guess it using a recursion loop.
 *The input is limited to characters 'A', 'B', 'C', and 'D', and must be less than 9 characters long.
 */

#include <iostream>
#include <string.h>

using namespace std;


//This method will take in two parameters: the result (in string form) and guess (which the method will recursively change itself).
//It will then iterate through different guesses, changing one letter at a time until the guess matches the result. 
void recursion(string result, string guess) {
    if (result == guess) {
        cout << "----correct";
        exit(0);
    }
    else {
        cout << "----incorrect" << endl;
        if (guess.length() < 9) {
            guess.append("A");
            cout << guess;
            recursion(result, guess);
        }
        if (guess.length() == 9) {
            if (guess.back() == 'A') {
                guess.back() = 'B';
                cout << guess;
                recursion(result, guess);
            }
            if (guess.back() == 'B') {
                guess.back() = 'C';
                cout << guess;
                recursion(result, guess);
            }
            if (guess.back() == 'C') {
                guess.back() = 'D';
                cout << guess;
                recursion(result, guess);
            }
            if (guess.back() == 'D') {
                guess.pop_back();
                if (guess.back() == 'A') {
                    guess.back() = 'B';
                }
                else if (guess.back() == 'B') {
                    guess.back() = 'C';
                }
                else if (guess.back() == 'C') {
                    guess.back() = 'D';
                }
                else if (guess.back() == 'D') {
                    guess.pop_back();
                    if (guess.back() == 'A') {
                        guess.back() = 'B';
                    }
                    else if (guess.back() == 'B') {
                      guess.back() = 'C';
                    }   
                    else if (guess.back() == 'C') {
                       guess.back() = 'D';
                    }
                    else if (guess.back() == 'D') {
                        guess.pop_back();
                        if (guess.back() == 'A') {
                            guess.back() = 'B';
                        }
                        else if (guess.back() == 'B') {
                            guess.back() = 'C';
                        }   
                        else if (guess.back() == 'C') {
                            guess.back() = 'D';
                        }
                        else if (guess.back() == 'D') {
                            guess.pop_back();
                            if (guess.back() == 'A') {
                                guess.back() = 'B';
                            }
                            else if (guess.back() == 'B') {
                                guess.back() = 'C';
                            }   
                            else if (guess.back() == 'C') {
                                guess.back() = 'D';
                            }
                            else if (guess.back() == 'D') {
                                guess.pop_back();
                                if (guess.back() == 'A') {
                                    guess.back() = 'B';
                                }
                                else if (guess.back() == 'B') {
                                    guess.back() = 'C';
                                }   
                                else if (guess.back() == 'C') {
                                    guess.back() = 'D';
                                }
                                else if (guess.back() == 'D') {
                                    guess.pop_back();
                                    if (guess.back() == 'A') {
                                        guess.back() = 'B';
                                    }
                                    else if (guess.back() == 'B') {
                                        guess.back() = 'C';
                                    }   
                                    else if (guess.back() == 'C') {
                                        guess.back() = 'D';
                                    }
                                    else if (guess.back() == 'D') {
                                        guess.pop_back();
                                        if (guess.back() == 'A') {
                                            guess.back() = 'B';
                                        }
                                        else if (guess.back() == 'B') {
                                            guess.back() = 'C';
                                        }   
                                        else if (guess.back() == 'C') {
                                            guess.back() = 'D';
                                        }
                                        else if (guess.back() == 'D') {
                                            guess.pop_back();
                                            if (guess.back() == 'A') {
                                                guess.back() = 'B';
                                            }
                                            else if (guess.back() == 'B') {
                                                guess.back() = 'C';
                                            }   
                                            else if (guess.back() == 'C') {
                                                guess.back() = 'D';
                                            }
                                            else if (guess.back() == 'D') {
                                                cout << guess << "----No Match";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cout << guess;
                recursion(result, guess);
            }
        }
    }
}

//This method will recursively check through the characters of the user input to see if any characters are lowercase. If so, the method will return false to end the program.
bool checkCase(string result, int i, int j) {
    char resultChar[i+1];
    strcpy(resultChar, result.c_str());
    if (j > i) {
        return true;
    }
    else if (islower(resultChar[j])) {
        return false;
    }
    else {
        return checkCase(result, i, j+1);
    }
}

//This method will recursively check through the characters of the user input to make sure all characters are 'A', 'B', 'C' or 'D'. If so, the method will return false to end the program.
bool checkLetter(string result, int i, int j) {
    char resultChar[i+1];
    strcpy(resultChar, result.c_str());
    if (j == i) {
        return true;
    }
    else {
        if ((result[j] == 'A') || (result[j] == 'B') || (result[j] == 'C') || (result[j] == 'D')) {
            return checkLetter(result, i, j+1);
        }
        else {
            return false;
        }
    }
}

//The main method will take in the user's input and call check methods to make sure the user's inputs adhere to requirements.
//It will call itself to restart the program if the input doesn't meet requirements.
int main() {
    string result;
    cout << "Please enter an uppercase string with length <= 9 and with only the characters A, B, C, and D:" << endl;
    cin >> result;
    int i = result.length();
    if (i > 9) {
        cout << "That string is longer than 9 characters. \nPlease enter a uppercase string with length <= 9 and with only the characters A, B, C, and D:";
        main();
    }
    else if (!checkCase(result, i, 0)) {
        cout << "That string contains lowercase character(s).";
        cout << "\nPlease enter a uppercase string with length <= 9 and with only the characters A, B, C, and D:";
        main();
    }
    else if (!checkLetter(result, i, 0)) {
        cout << "That string contains character(s) that do not equal capital A, B, C, or D.";
        cout << "\nPlease enter a uppercase string with length <= 9 and with only the characters A, B, C, and D:";
        main();
    }
    string guess;
    recursion(result, guess);
}