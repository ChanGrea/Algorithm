#include <iostream>
#include <string>

using namespace std;

int main() {
    int input[3];
    string str;

    scanf("%d %d %d", &input[0], &input[1], &input[2]);

    cin.ignore(256,'\n');
    getline(cin, str);

    for(int i = 0; i < 2; i++) {
        for(int j = i + 1; j < 3; j++) {
            if(input[i] > input[j]) {
                int tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
            }
        }
    }

    for(int i = 0; i < 3; i++) {
        printf("%d ", input[str.at(i)-'A']);
    }

    return 0;
}