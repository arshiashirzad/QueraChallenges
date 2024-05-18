#include <iostream>
using namespace std;

int main() {

    int rows, r = 1;
    cin >> rows;

    for(int i = 0; i < rows; i++) {
        for(int j = 0; j <= i; j++) {
            if (j == 0 || i == 0)
                r = 1;
            else
                r = r*(i-j+1)/j;

            cout << r<< " ";
        }
        cout << endl;
    }

    return 0;
}
