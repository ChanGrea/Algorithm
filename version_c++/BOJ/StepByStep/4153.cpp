#include <iostream>

using namespace std;

string check(int a, int b, int c)
{
    if (a * a == b * b + c * c)
        return "right";
    return "wrong";
}

int main()
{
    int a, b, c;

    while (scanf("%d %d %d", &a, &b, &c) && a != 0 && b != 0 && c != 0)
    {
        if (a > b && a > c)
        {
            cout << check(a, b, c) << endl;
        }

        if (b > a && b > c)
        {
            cout << check(b, a, c) << endl;
        }

        if (c > a && c > b)
        {
            cout << check(c, a, b) << endl;
        }
    }

    return 0;
}