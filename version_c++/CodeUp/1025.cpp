#include <stdio.h>

int main()
{
    int n, res[5], div = 1;
    scanf("%d", &n);
    for (int i = 0; i < 5; i++)
    {
        res[i] = n % 10 * div;
        n /= 10;
        div *= 10;
    }
    for (int i = 4; i >= 0; i--)
    {
        printf("[%d]\n", res[i]);
    }
    return 0;
}