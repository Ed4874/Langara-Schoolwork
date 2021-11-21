#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

void forward(int n) {
  v.push_back (n);
}

void backward(int n) {
  std::reverse(v.begin(), v.end());
}

int sumR(int n) {
  
}

int sumDigits(int n);
int maxR(const vector<int> &v,int i);
void revV(vector<int> &v,int i);

int main(){
   int n;
   vector<int> v = {3,16,2,4,7,11,19};
   cout <<"Enter an positive integer:";
   cin >> n;
   cout << forward(n);
   cout <<endl;
   cout << backward(n);
   cout << endl; 
   cout << sumR(n) << endl;
   cout <<"Enter an positive integer:";
   cin >> n;
   cout << sumDigits(n) << endl;
   cout << "Max in vector = " << maxR(v) << endl; 
   revV(v);
   cout << "The vector is now reversed" << endl;
   cout << "[";
   for(auto i:v){
     cout << i << ",";
   }  
   cout << "]" << endl;
   return 0; 
   
}