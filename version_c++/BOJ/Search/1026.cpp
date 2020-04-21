#include <stdio.h>
#include <algorithm>

using namespace std;

int main() {
    int n;
    scanf("%d", &n);

    int a[n], b[n], sum = 0;

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    sort(a, a+n);

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &b[i]);
    }

    sort(b, b+n);

    for (int i = 0; i < n; i++)
    {
        sum += a[i] * b[n-i-1];
    }

    printf("%d\n", sum);
    
    return 0;
}