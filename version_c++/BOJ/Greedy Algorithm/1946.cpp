#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) {
    return a.first < b.first;
}

int main()
{
    int t;

    scanf("%d", &t);

    while (t-- > 0)
    {
        int n, result = 1;
        scanf("%d", &n);

        vector< pair<int, int> > score(n);
        for (int i = 0; i < n; i++)
        {
            scanf("%d %d", &score[i].first, &score[i].second);
        }

        sort(score.begin(), score.end(), compare);

        int selected = 0;
        for (int i = 1; i < n; i++)
        {
            if(score[i].second < score[selected].second) {
                result++;
                selected = i;
            }
        }

        printf("%d\n", result);
    }

    return 0;
}