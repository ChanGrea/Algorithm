#include <stdio.h>

int main() {
    int x, result = 0;
    scanf("%d", &x);

    if ( x < 10 ) {
        result = x;
    } else {
        result = 9;
        for (int i = 10; i <= x; i++)
        {
            int n = i / 10, before = i % 10, diff = (n % 10) - before;
            while(n > 0) {
                if( (n % 10) - before != diff)
                    break;
                before = n % 10;
                n /= 10;
            }

            if ( n <= 0)
                result++;
        }
    }

    printf("%d", result);
    

    return 0;
}