#include <stdio.h>
#include <string.h>

int check(char *word) {
    int len = strlen(word);
    for(int i = 0; i < len; i++){
        int tmp = i;
        for(int j = i + 1; j < len; j++) {
            if(word[tmp] == word[j]) {
                if (j - tmp == 1) {
                    tmp = j;
                } else {
                    return 0;
                }
            }
        }
    }

    return 1;
}
int main() {
    int n, result = 0;
    scanf("%d", &n);

    while ( n-- > 0 ) {
        char input[101];
        scanf("%s", input);

        result += check(input);
    }

    printf("%d", result);

    return 0;
}