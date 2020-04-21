#include <iostream>

using namespace std;

const int MAX = 8 + 1;
int n, m;
int arr[MAX];
bool visited[MAX];

void func(int index, int count) {
    if(count == m) {
        for(int i = 0; i < m; i++) {
            cout << arr[i] << " ";
        }
        cout << "\n";
        return;
    }

    for(int i = index; i <= n; i++) {
        if(!visited[i]){
            visited[i] = true;
            arr[count] = i;
            func(i + 1, count + 1);
            visited[i] = false;
        }
    }
}

int main() {
    cin >> n >> m;

    func(1, 0);

    return 0;
}