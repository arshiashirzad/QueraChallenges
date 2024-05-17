#include <iostream>
using namespace std;
int main() {

    int R [8];
    int L [8];
    int x = 0 ;
    int counter = 0 ;
    for (int i =0; i< 8 ; i++){
        cin >> x;
        R[i] = x;
    }
    for (int i =0; i< 8 ; i++){
        cin >> x;
        L[i] = x;
    }
    for (int i =0; i< 8 ; i++){
       if (L[i] == R[i] && L[i] ==1 )
           counter++;
    }
    cout<< counter;
    return 0;
}
