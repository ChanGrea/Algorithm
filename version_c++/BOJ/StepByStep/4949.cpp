#include <iostream>
#include <stack>

using namespace std;

int main()
{
    while (1)
    {
        string input;
        getline(cin, input);
        int len = input.length();

        if (input == ".")
        {
            break;
        }

        stack<char> st;
        for (int i = 0; i < len; i++)
        {
            if (input[i] == '(' || input[i] == '[')
            {
                st.push(input[i]);
            }

            if (input[i] == ')' && st.top() == '(')
            {
                st.pop();
            }
            else
            {
                break;
            }

            if (input[i] == ']' && st.top() == '[')
            {
                st.pop();
            }
            else
            {
                break;
            }
        }

        // if (st.empty())
        // {
        //     cout << "yes" << endl;
        // }
        // else
        // {
        //     cout << "no" << endl;
        // }
    }

    return 0;
}