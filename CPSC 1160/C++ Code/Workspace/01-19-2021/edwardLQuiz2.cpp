#include <iostream>
#include <vector>

using namespace std;

int even_sum(std::vector<int> v, int i) {
    if (i <= 0) {
        return 0;
    }
    if (((v[i-1]) % 2) == 0) {
        return (even_sum(v, i-1) + v[i-1]);
    }
    else {
        return (even_sum(v, i-1));
    }
}

int main() {
    
    std::vector<int> v = {1,56,23,71,27,56,4,9,11};
    int i = v.size();
    cout << even_sum(v, i) << endl;
}