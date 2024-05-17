#include <iostream>
using namespace std;
int main() {

    int x ;
    cin >>x;
    string str;
    string alaki;
    string Arr[x];
    int counts[100] = {0};
    int uniqueCount = 0;
    string uniqueNames[100];
    for (int i =0 ;i < x; i++){
        cin >> str;
        cin >>alaki;
        Arr[i]=str;
    } for (int i = 0; i < x; ++i) {
        bool found = false;
        for (int j = 0; j < uniqueCount; ++j) {
            if (Arr[i] == uniqueNames[j]) {
                counts[j]++;
                found = true;
                break;
            }
        }
        if (!found) {
            uniqueNames[uniqueCount] = Arr[i];
            counts[uniqueCount] = 1;
            uniqueCount++;
        }
    }
    string maxName;
    int maxCount = 0;
    for (int i = 0; i < uniqueCount; ++i) {
        if (counts[i] > maxCount) {
            maxName = uniqueNames[i];
            maxCount = counts[i];
        }
    }
    cout<< maxCount;
    return 0;
}
