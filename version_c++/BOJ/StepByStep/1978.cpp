#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main()
{
    int n, count = 0;
    bool prime[1001];

    prime[1] = false;
    for (int i = 2; i <= 1000; i++)
    {
        prime[i] = true;
    }

    for (int i = 2; i <= 1000; i++)
    {
        for (int j = 2; j <= 1000; j++)
        {
            if (prime[j] && j != i && j % i == 0)
            {
                prime[j] = false;
            }
        }
    }

    cin >> n;
    int number;
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &number);

        if (prime[number])
            count++;
    }

    cout << count;

    return 0;
}