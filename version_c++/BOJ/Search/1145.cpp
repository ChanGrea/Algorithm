#include <stdio.h>
#include <algorithm>

using namespace std;

int main()
{
    int arr[5];
    scanf("%d %d %d %d %d", &arr[0], &arr[1], &arr[2], &arr[3], &arr[4]);

    sort(arr, arr+5);

    int result = arr[2];
    while(true) {
        int count = 0;

        for(int i = 0; i < 5; i++) {
            if(result % arr[i] == 0){
                count++;
            }
        }

        if(count >= 3)
            break;
        
        result++;
    }

    printf("%d\n", result);

    return 0;
}