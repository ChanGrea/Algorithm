#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;

    vector<int> v;
    int length;
    for (int i = 0; i < n; i++)
    {
        cin >> length;
        v.push_back(length);
    }

    sort(v.begin(), v.end());

    int answer = -1;
    for (int i = n - 1; i >= 2; i--)
    {
        if (v[i] < v[i - 1] + v[i - 2])
        {
            answer = v[i] + v[i - 1] + v[i - 2];
            break;
        }
    }

    cout << answer << endl;

    return 0;
}