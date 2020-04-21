#include <stdio.h>

int main() {
    int result = 0;

    for (int i = 0; i < 8; i++)
    {
        for(int j = 0; j < 8; j++) {
            char c;
            scanf("%c", &c);

            if(i % 2 == 0 && j % 2 == 0 && c == 'F'){
                printf("%d %d\n", i, j);
                result++;
            }
            if(i % 2 == 1 && j % 2 == 1 && c == 'F'){
                printf("%d %d\n", i, j);
                result++;
            }
        }
    }

    printf("%d\n", result);

    return 0;
}