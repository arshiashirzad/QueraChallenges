#include <iostream>
using namespace std;

int Paksazi(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int result = 0;
    for (int i = 2; i <= n; i *= 2) {
        result = 1 + Paksazi(n % i);
    }
    return result;
}

int main() {
    int n;
    cin >> n;
    char Way[n];
    for(int i = 0; i < n; i++) {
        cin >> Way[i];
    }

    int s, f;
    cin >> s >> f;

    int l = 0;
    int Min = 0;

    s--;
    f--;

    if (s >= f) {
        for (int i = f; i <= s; i++) {
            if (Way[i] == 'H') {
                l++;
            } else {
                Min += Paksazi(l);
                l = 0;
            }
        }
    } else {
        for (int i = f; i >= s; i--) {
            if (Way[i] == 'H') {
                l++;
            } else {
                Min += Paksazi(l);
                l = 0;
            }
        }
    }

    // Add the final segment if it ends with 'H'
    if (l > 0) {
        Min += Paksazi(l);
    }

    cout << Min;
    return 0;
}
