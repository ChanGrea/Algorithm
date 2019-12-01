#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    vector<string> v[201];
    cin >> n;
    for (int i=0; i<n; i++) {
        int x; string name;
        cin >> x >> name;
        v[x].push_back(name);
    }
     
    for (int i=0; i<201; i++) {
        for (int j=0; j<v[i].size(); j++) {
            cout << i << ' ' << v[i][j] << '\n';
        }
    }
     
    return 0;
}