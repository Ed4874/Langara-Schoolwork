#include <iostream>

using namespace std;

void fun(string n) {
    if (n.length() == 9) {
        if (n[8] == 'A') {
            fun("AAAAAAAAB");
            fun("AAAAAAAAC");
            fun("AAAAAAAAD");
        }
    }
    std::cout << n << endl;
}

int main() {
    string n = "AAAAAAAAA";
    fun(n);
}