#include <iostream>
#include <vector>
#include <string>
#include <time.h>

using namespace std;

void sortRec(vector<int>&A, int n, int &count) {

    if (n==1)
        return;
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

int main () {
    int size;
    cout << "What size should the vectors be?" << endl;
    cin >> size;

    int count = 9;

    std::vector<int> bestCase;
    for (int i = 1; i <= size; i++) {
        bestCase.push_back(i);
    }

    std::vector<int> worstCase;
    for (int i = size; i >= 1; i--) {
        worstCase.push_back(i);
    }

    cout << "Number of comparisons for best case is ";
    sortRec(bestCase, size, count);
    cout << count;
    count = 9;

    cout << endl;

    cout << "Number of comparisons for worse case is ";
    sortRec(worstCase, size, count);
    cout << count-9;
    count = 9;

    cout << endl;

    int finalResult = 0;
    for (int i = 0; i < 100; i++) {
        std::vector<int> avgCase;
        for (int i = size; i >= 1; i--) {
            avgCase.push_back(rand());
        }
        sortRec(avgCase, size, count);
        finalResult+=(count-9);
        count = 9;
    }
    cout << "Number of comparisons for average case is ";
    cout << finalResult/100;

    return 0;
}