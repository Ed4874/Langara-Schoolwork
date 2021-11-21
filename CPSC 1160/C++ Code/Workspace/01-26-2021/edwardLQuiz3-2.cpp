#include <iostream>
#include <vector>
using namespace std;

int fct(const std::vector<int> &A, int n)
{
   if ( n ==3 )

      return A[0]* A[1] * A[2]* A[3];

   else

      return  A[n-1] * fct(A, n-1);

}

int main() {
    std::vector<int> A = {1, 2, 3, 4, 5, 6};
    double a = fct(A, 6);
    cout << a;
}