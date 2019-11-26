#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;

    int a[n], b[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    sort(a, a + n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &b[i]);
    }
    sort(b, b + n);

    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += a[i] * b[n - i - 1];
    }

    cout << sum << endl;

    return 0;
}