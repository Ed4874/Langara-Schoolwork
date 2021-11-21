#include <iostream>

using namespace std;

int recursion(int decimal) {
    if (decimal == 0) {
        return 0;
    }
    else {
        return decimal % 2 + 10 * recursion(decimal / 2);
    }
}

int main() {
    int decimal;
    cout << "Please enter a decimal number: ";
    cin >> decimal;
    cout << recursion(decimal);
}