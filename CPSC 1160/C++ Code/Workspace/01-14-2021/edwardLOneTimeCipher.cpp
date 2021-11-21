/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Due: January 21, 2020
 *Program Purpose: This program will act as the encrypter for a one time cipher.*/


#include <iostream>
#include <fstream>
#include <vector>

using namespace std;

//This method will read the file and detect how many characters is present in that file.
int getLength(string filename){
    ifstream MyFile;
    int length;
    string line;
    MyFile.open(filename, ios::in);
    while (getline(MyFile, line)) {
        length += line.length();
    }
    return length;
}
//This method will take in a char value and convert it to an int value using a switch statement.
int getValue(char value) {
    int returnValue;
    switch (value) {
        case 'a':
        case 'A':
            returnValue = 0;
            return returnValue;
        case 'b':
        case 'B':
            returnValue = 1;
            return returnValue;
        case 'c':
        case 'C':
            returnValue = 2;
            return returnValue;
        case 'd':
        case 'D':
            returnValue = 3;
            return returnValue;
        case 'e':
        case 'E':
            returnValue = 4;
            return returnValue;
        case 'f':
        case 'F':
            returnValue = 5;
            return returnValue;
        case 'g':
        case 'G':
            returnValue = 6;
            return returnValue;
        case 'h':
        case 'H':
            returnValue = 7;
            return returnValue;
        case 'i':
        case 'I':
            returnValue = 8;
            return returnValue;
        case 'j':
        case 'J':
            returnValue = 9;
            return returnValue;
        case 'k':
        case 'K':
            returnValue = 10;
            return returnValue;
        case 'l':
        case 'L':
            returnValue = 11;
            return returnValue;
        case 'm':
        case 'M':
            returnValue = 12;
            return returnValue;
        case 'n':
        case 'N':
            returnValue = 13;
            return returnValue;
        case 'o':
        case 'O':
            returnValue = 14;
            return returnValue;
        case 'p':
        case 'P':
            returnValue = 15;
            return returnValue;
        case 'q':
        case 'Q':
            returnValue = 16;
            return returnValue;
        case 'r':
        case 'R':
            returnValue = 17;
            return returnValue;
        case 's':
        case 'S':
            returnValue = 18;
            return returnValue;
        case 't':
        case 'T':
            returnValue = 19;
            return returnValue;
        case 'u':
        case 'U':
            returnValue = 20;
            return returnValue;
        case 'v':
        case 'V':
            returnValue = 21;
            return returnValue;
        case 'w':
        case 'W':
            returnValue = 22;
            return returnValue;
        case 'x':
        case 'X':
            returnValue = 23;
            return returnValue;
        case 'y':
        case 'Y':
            returnValue = 24;
            return returnValue;
        case 'z':
        case 'Z':
            returnValue = 25;
            return returnValue;
    }
}

//This method will take a char's value and add it with a value from the pad to encrypt the message.
void shiftChar(char og, char shift) {
    int x = getValue(og), y = getValue(shift);
    int z = (x+y)%26;
    switch (z) {
        case 0:
            cout << 'A';
            break;
        case 1:
            cout << 'B';
            break;
        case 2:
            cout << 'C';
            break;
        case 3:
            cout << 'D';
            break;
        case 4:
            cout << 'E';
            break;
        case 5:
            cout << 'F';
            break;
        case 6:
            cout << 'G';
            break;
        case 7:
            cout << 'H';
            break;
        case 8:
            cout << 'I';
            break;
        case 9:
            cout << 'J';
            break;
        case 10:
            cout << 'K';
            break;
        case 11:
            cout << 'L';
            break;
        case 12:
            cout << 'M';
            break;
        case 13:
            cout << 'N';
            break;
        case 14:
            cout << 'O';
            break;
        case 15:
            cout << 'P';
            break;
        case 16:
            cout << 'Q';
            break;
        case 17:
            cout << 'R';
            break;
        case 18:
            cout << 'S';
            break;
        case 19:
            cout << 'T';
            break;
        case 20:
            cout << 'U';
            break;
        case 21:
            cout << 'V';
            break;
        case 22:
            cout << 'W';
            break;
        case 23:
            cout << 'X';
            break;
        case 24:
            cout << 'Y';
            break;
        case 25:
            cout << 'Z';
            break;
    }
}

//This method will ask for the starting position the user would like to use on the pad and return its int value.
int getPos (int &pos) {
    cout << "Enter starting position on the pad: ";
    cin >> pos;
    return pos;
}

//This method will loop through the file, convert the message and pad into char vectors and call various methods to encrypt the message.
void getChar(string padname, string filename, int length1, int length2, int pos) {        
    ifstream MyFile1, MyFile2;
    string line1, line2;
    MyFile1.open(padname, ios::in);
    MyFile2.open(filename, ios::in);
    while (!MyFile2.eof()) {
        getline(MyFile1, line1);
        getline(MyFile2, line2);
        length1 = line1.length();
        length2 = line2.length();
        std::vector<char> charLine1(line1.begin(), line1.end());
        std::vector<char> charLine2(line2.begin(), line2.end());
        std::vector<char> charLine3;
        char remove = ' ';
        for (int i = 0; i < length2; i++) {
            if (isspace(charLine2[i])) {
                continue;
            }
            else {
                charLine3.push_back(charLine2[i]);
            }
        }
        for (int i = 0; i < length2; i++)
            shiftChar(charLine3[i], charLine1[i+pos]);
    }
    MyFile1.close();
    MyFile2.close();
}

//The main method is used to ask for the pad name, filename, and call other methods to find the character count of the message.
//After that, the main method will pass off everything to getChar in order to encrypt the message.
int main() {
    string padname, filename;
    int pos;
    cout << "Which one-time pad do you want to use? ";
    cin >> padname;

    getPos(pos);

    cout << "Which file do you want to encrypt? ";
    cin >> filename;

    int length1 = getLength(padname);
    int length2 = getLength(filename);

    getChar(padname, filename, length1, length2, pos);
}