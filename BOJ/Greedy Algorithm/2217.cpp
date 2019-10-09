#include <stdio.h>
#include <algorithm>

using namespace std;

int main() {
    int n, max = -1;
    scanf("%d", &n);

    int arr[n];
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    sort(arr, arr+n);

    for(int i = n-1; i >= 0; i--) {
        if(arr[i] * (n-i) > max) {
            max = arr[i] * (n-i);
        }
    }

    printf("%d", max);

    return 0;
}