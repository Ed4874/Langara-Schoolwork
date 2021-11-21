#include <iostream>
#include <vector>
using namespace std;

double fct(const std::vector<int> A, int n){
    if ( n == 3 )
        return A[n-3]/A[n-2]/A[n-1]/A[n];
    else
        return (A[n-1]/A[n-1])/fct(A, n-1);}

int main() {
    std::vector<int> A = {1, 2, 3, 4, 5, 6};
    double a = fct(A, 10);
    cout << a;
}