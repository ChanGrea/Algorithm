#include <stdio.h>
#include <string.h>

int main()
{
    char x[51], y[51];

    scanf("%s %s", x, y);

    int min = strlen(x);
    int lenX = strlen(x);
    int lenY = strlen(y);
    for (int i = lenY - 1; i >= (lenX - 1); i--)
    {
        int len = 0;
        for (int j = 0; j < lenX; j++)
        {
            if (y[i - j] != x[lenX - j - 1])
            {
                len++;
            }
        }
        if (min > len)
        {
            min = len;
        }
    }

    printf("%d", min);

    return 0;
}