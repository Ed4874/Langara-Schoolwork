#include <iostream>
#include <fstream>

using namespace std;

// int getLength(string filename){
//     ifstream MyFile;
//     int length;
//     string line;
//     MyFile.open(filename, ios::in);
//     while (getline(MyFile, line)) {
//         length += line.length();
//     }
//     return length;
// }

void shiftChar(char og, char shift) {
    
}


int getPos (int &pos) {
    cout << "Enter starting position on the pad: ";
    cin >> pos;
    return pos;
}


//std::string getMsg(const std::string &filename) {

//}


int main() {
    string padname, filename;
    int pos;
    cout << "Which one-time pad do you want to? ";
    cin >> padname;
    //cout << padname << endl;
    //fstream MyFile;
    //MyFile.open(padname, ios::in);
    //char Character;
    
    
    //string line;
    //getline(MyFile, line);
    //cout << line << "\n";
    //MyFile.close();

    getPos(pos);
    //cin.ignore(pos, 1);
    //for (int i = 0; i < 10; i++) {
    //    MyFile.get(Character);
    //    cout << Character << endl;
    //}

    cout << "Which file do you want to encrypt? ";
    cin >> filename;

    ifstream MyFile;
    int length;
    string line;
    MyFile.open(filename, ios::in);
    while (getline(MyFile, line)) {
        length = line.length();
        char charLine[length + 1];
        strcpy(charLine, line.c_str());
        for (int i = 0; i < length; i++)
            cout << charLine[i];
    }


    // int length1 = getLength(padname);
    // int length2 = getLength(filename);

    // cout << length1 << endl;
    // cout << length2 << endl;

    // MyFile.open(padname, ios::in);
    // char Character;
    
    
    // string line;
    // int length;
    // while (getline(MyFile, line)) {
    //     //cout << line << endl;
    //     length += line.length();
    // }
    // char pad[length];

    // while (getline(MyFile, line)) {
    //     strcpy(pad, line.c_str());
    // }
    // std::string s;
    
    // for (int i = 0; i < length; i++) {
    //     s.append(1, pad[i]);
    // }
    // cout << s;




    // char c;
    // for (int i = 0; i < length; i++) {
    //     MyFile.get(c);
    //     pad[i] = c;
    //     cout << pad[i] << endl;
    // }
    // MyFile.close();

}