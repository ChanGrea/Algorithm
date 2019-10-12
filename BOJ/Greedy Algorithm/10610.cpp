#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main()
{
    char n[100001];
    int arr[10], sum = 0;

    scanf("%s", n);

    sort(n, n + strlen(n));

    for (int i = 0; i < strlen(n); i++)
    {
        sum += (int)n[i] - 48;
    }

    if (n[0] != '0' | sum % 3 != 0)
    {
        printf("-1");
    }
    else
    {
        for (int i = strlen(n) - 1; i >= 0; i--)
        {
            printf("%d", (int)n[i] - 48);
        }
    }

    return 0;
}