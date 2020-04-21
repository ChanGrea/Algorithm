#include <iostream>

using namespace std;

int main()
{
    bool check[42] = {
        false,
    };
    int count = 0;

    for (int i = 0; i < 10; i++)
    {
        int n;
        cin >> n;
        check[n % 42] = true;
    }

    for (int i = 0; i < 42; i++)
    {
        if (check[i])
            count++;
    }

    cout << count << endl;

    return 0;
}