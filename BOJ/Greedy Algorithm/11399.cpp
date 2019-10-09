#include <stdio.h>
#include <array>
#include <algorithm>

int main()
{
    int n, result = 0;
    scanf("%d", &n);

    int *array = new int[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &array[i]);
    }

    std::sort(array, array + n);

    for (int i = 0; i < n; i++)
    {
        result += array[i] * (n - i);
    }

    printf("%d", result);

    return 0;
}