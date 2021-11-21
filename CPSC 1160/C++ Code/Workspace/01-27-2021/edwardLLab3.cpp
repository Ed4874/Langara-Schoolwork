#include <iostream>
#include <vector>
#include <string>
#include <time.h>

using namespace std;

int sortRec(vector<int>&A, int n, int count) {
    if (n==1) {
        return count;
    }
    sortRec(A, n -1, count);
    int i;
    int tmp = A[n -1];
    i = n-1;
    while (i>0 && A[i-1] >tmp) {
        A[i] = A[i-1];
        i--;
        count++;
    }
    A[i] = tmp;
}

int main() {
    srand(time(NULL));
    vector<int> bestCase = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    vector<int> worstCase = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int n = bestCase.size();
    static int count = 0;
    count = sortRec(bestCase, n, count);
    cout << endl;
    for (int j = 0; j < n; j++) {
        std::cout << bestCase.at(j) << ' ';
    }
    cout << endl << count << endl;

    cout << endl;
    count = 0;
    count = sortRec(worstCase, n, count);
    cout << endl;
    for (int j = 0; j < n; j++) {
        std::cout << worstCase.at(j) << ' ';
    }
    cout << endl << count << endl;


    for (int i = 0; i < 100; i++) {
        vector<int> avgCase = {rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand()};
    }
}