#include <iostream>
#include <vector>
#include <string>

#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;

    vector<int> numList;

    while (n > 0)
    {
        int number = n % 10;
        numList.push_back(number);
        n /= 10;
    }

    sort(numList.begin(), numList.end());

    for (int i = numList.size() - 1; i >= 0; i--)
    {
        cout << numList[i];
    }
    cout << endl;

    return 0;
}