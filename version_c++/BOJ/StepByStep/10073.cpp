#include <iostream>
#include <stack>

using namespace std;

int main()
{
    stack<int> s;
    int k;
    cin >> k;

    int input;
    while (k-- > 0)
    {
        cin >> input;
        if (input == 0)
        {
            s.pop();
        }
        else
        {
            s.push(input);
        }
    }

    int result = 0;
    while (!s.empty())
    {
        result += s.top();
        s.pop();
    }

    cout << result << endl;

    return 0;
}