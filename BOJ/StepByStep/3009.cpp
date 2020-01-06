#include <iostream>

using namespace std;

int main()
{
    int a[3][2], x, y;
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 2; j++)
            cin >> a[i][j];

    x = a[0][0] == a[1][0] ? a[2][0] : (a[0][0] == a[2][0] ? a[1][0] : a[0][0]);
    y = a[0][1] == a[1][1] ? a[2][1] : (a[0][1] == a[2][1] ? a[1][1] : a[0][1]);

    cout << x << ' ' << y;

    return 0;
}