#include <iostream>

using namespace std;

int main()
{
    int m;
    cin >> m;

    int ballLocation = 1;
    for (int i = 0; i < m; i++)
    {
        int x, y;
        cin >> x >> y;

        if (ballLocation == x)
        {
            ballLocation = y;
        }
        else if (ballLocation == y)
        {
            ballLocation = x;
        }
    }

    cout << ballLocation << endl;

    return 0;
}