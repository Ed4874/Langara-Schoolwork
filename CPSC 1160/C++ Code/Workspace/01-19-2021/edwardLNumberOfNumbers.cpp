#include <iostream>

using namespace std;

int recursion(string characters, int length, int i, int count) {
    if (i == length) {
        return count;
    }
    else {
        char characterArray[length + 1];
        strcpy(characterArray, characters.c_str());
        if (isdigit(characterArray[i])) {
            count++;
        }
        i++;
        return recursion(characters, length, i, count);
    }
}

int main() {
    string characters;
    cout << "Please enter characters: ";
    cin >> characters;
    int length = characters.length(), i = 0, count = 0;
    cout << recursion(characters, length, i, count);
}