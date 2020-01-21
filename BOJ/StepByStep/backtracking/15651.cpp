#include <iostream>

using namespace std;
const int MAX = 6 + 1;

int n, m;
int arr[MAX];
bool visited[MAX];

void func(int cnt) {
    if(cnt == m) {
        for(int i = 0; i < m; i++) {
            cout << arr[i] << " ";
        }
        cout << "\n";
        return;
    }

    for(int i = 1; i <= n; i++) {
        arr[cnt] = i;
        func(cnt + 1);
    }
}

int main() {
    cin >> n >> m;

    func(0);

    return 0;
}