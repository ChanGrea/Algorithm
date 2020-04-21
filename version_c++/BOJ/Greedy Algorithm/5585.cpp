#include <stdio.h>

int main() {
    int n, result = 0;
    int money[] = {500, 100, 50, 10, 5, 1};

    scanf("%d", &n);
    n = 1000 - n;

    for(int i = 0; i < 6; i++){
        result += n / money[i];
        n %= money[i];
    }

    printf("%d", result);

    return 0;
}