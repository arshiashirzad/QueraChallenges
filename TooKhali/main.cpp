#include <iostream>
using namespace std;

void print_rectangle(int n)
{
    int i, j;
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
        {
            if (i == 1 || i == n ||
                j == 1 || j == n)
                cout << "*";
            else
                cout << " ";
        }
        cout << endl;
    }

}
int main()
{
    int sq;
    cin >> sq;
    print_rectangle(sq);
    return 0;
}

