#include <iostream>
using namespace std;
int main() {
    int n ;
    cin>> n ;
    int arr1[n];
    int arr2[n];
    int count=0;
    string txt;
    cin>> txt;
    for(int i=0; i<n ; i++){
        arr1[i] = txt[i] - '0';
    }
    cin >> txt;
    for(int i=0; i<n ; i++){
        arr2[i] = txt[i] - '0';
    }
    for(int i=0; i<n ; i++){
        if(arr1[i] != arr2[i]){
            count ++;
        }
    }
    if(count%2 ==0){
        cout << count/2;
    }else{
        cout<< "NO";
    }
    return 0;
}
