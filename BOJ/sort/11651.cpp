#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

bool comp( pair<int, int> a, pair<int, int> b ) {
    if( b.second == a.second ) {
        return b.first > a.first;
    } else {
        return b.second > a.second;
    }
}

int main() {
    int n;
    scanf("%d", &n);

    vector< pair<int, int> > v;

    for(int i = 0; i < n; i++) {
        int x, y;
        scanf("%d %d", &x, &y);

        v.push_back(make_pair(x, y));
    }

    sort(v.begin(), v.end(), comp);

    for(int i = 0; i < n; i++ ) {
        printf("%d %d\n", v[i].first, v[i].second);
    }

    return 0;
}