#include <stdio.h>

int main()
{
    char c;
    while (true)
    {
        scanf("%c ", &c);
        printf("%c\n", c);
        if (c == 'q')
            break;
    }
    return 0;
}