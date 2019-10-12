#include <stdio.h>

int main()
{
    int n, m, k, result = 0;

    scanf("%d %d %d", &n, &m, &k);

    while (n >= 2 && m >= 1)
    {
        n -= 2;
        m -= 1;
        result++;
    }

    k = k - n - m;

    while (k > 0)
    {
        result--;
        k -= 3;
    }

    printf("%d", result);

    return 0;
}