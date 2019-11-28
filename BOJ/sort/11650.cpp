#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    scanf("%d", &n);

    vector< pair<int, int> > v(n);
    for (int i = 0; i < n; i++)
    {
        int x, y;
        scanf("%d %d", &x, &y);
        v[i] = make_pair(x, y);
    }

    sort(v.begin(), v.end());

    for (int i = 0; i < n; i++)
    {
        printf("%d %d\n", v[i].first, v[i].second);
    }

    return 0;
}