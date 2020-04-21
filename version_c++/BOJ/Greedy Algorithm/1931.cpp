#include <stdio.h>
#include <algorithm>
#include <vector>

using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) {
    if(a.second == b.second){
        return b.first > a.first;
    }
    return b.second > a.second;
}

int main() {
    int n;
    scanf("%d", &n);
    vector< pair<int, int> > v(n);

    for(int i = 0; i < n; i++) {
        scanf("%d %d", &v[i].first, &v[i].second);
    }

    sort(v.begin(), v.end(), compare);

    int last = -1;
    int count = 0;
    for (int i=0; i<v.size(); i++) {
        if(v[i].first >= last) {
            last = v[i].second;
            count++;
        }

    }

    printf("%d", count);
    
    return 0;
}