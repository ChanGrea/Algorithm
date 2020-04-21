#include <stdio.h>

int main()
{
    int n, time = 0, k = 1;
    scanf("%d", &n);

    while (n > 0)
    {
        time++;
        if (n < k)
        {
            k = 1;
        }
        n -= k;
        k++;
    }

    printf("%d\n", time);

    return 0;
}