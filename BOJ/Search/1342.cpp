#include <iostream>
#include <string>
using namespace std;
#define MAX_SIZE 11

char output[MAX_SIZE];
bool check[MAX_SIZE];
string s;
int len, ret;
int alphabet[26];

bool func() {
    for (int i = 0; i < len - 1; i++) {
        if (output[i] == output[i + 1]) return false;
    }
 
    return true;
}

int factorial(int n) {
    int result = 1;
    for (int i = n; i >= 1; i--) {
        result *= i;
    }
 
    return result;
}

void dfs(int idx, int d) {
    output[d] = s[idx];
 
    if (d == len - 1) {
        if (func()) ret++;
        return;
    }
 
    for (int i = 0; i < len; i++) {
 
        if (check[i] == 0) {
            check[i] = 1;
            dfs(i, d + 1);
            check[i] = 0;
        }
    }
}

int main() {
    cin >> s;

    len = s.length();
    ret = 0;

    for (int i = 0; i < len; i++) {
        alphabet[s[i] - 'a']++;
    }
 
    for (int i = 0; i < len; i++) {
        check[i] = true;
        dfs(i, 0);
        check[i] = false;
    }
 
    for (int i = 0; i < 26; i++) {
        if (1 < alphabet[i]) {
            ret /= factorial(alphabet[i]);
        }
    }
 
    cout << ret;

    return 0;
}