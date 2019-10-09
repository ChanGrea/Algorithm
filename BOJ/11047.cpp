#include <stdio.h>

int main() {
    int n, k, result = 0;

    scanf("%d %d", &n, &k);

    int* coins = new int[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &coins[i]);
    }
    for(int i = n-1; i >= 0; i--){
        result += k / coins[i];
        k %= coins[i];
    }

    printf("%d", result);

    return 0;
}