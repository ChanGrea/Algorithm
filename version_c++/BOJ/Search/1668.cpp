#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int i = 0; i < n; i++) {
        scanf("%d", arr+i);
    }

    int bound = 0, count = 0;
    for(int i = 0; i < n; i++) {
        if(arr[i] > bound) {
            count++;
            bound = arr[i];
        }
    }
    printf("%d\n", count);

    bound = 0, count = 0;
    for(int i = n - 1; i >= 0; i--) {
        if(arr[i] > bound) {
            count++;
            bound = arr[i];
        }
    }
    printf("%d\n", count);

    return 0;
}