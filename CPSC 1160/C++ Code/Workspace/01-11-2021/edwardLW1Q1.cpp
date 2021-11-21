#include <iostream>
#include <vector>

using namespace std;

bool my_function(int len, vector<int> v) {
    int count = 1, j = 0;
    for (int i = 0; i < v.size(); i++) {
        if (v[j] >= v[j+1]) {
            count++;
        }
        else {
            count = 1;
        }
        if (count == len) {
                return true;
        }
        j++;
    }
    return false;
}
int main() {
    vector<int> v ={6,7,4,123,6,1,84,23,56};  
    if (my_function(4, v) == 1) {
        cout << "true";
    }
    else {
        cout << "false";
    }
}
