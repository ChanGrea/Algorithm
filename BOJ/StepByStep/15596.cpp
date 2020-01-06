#include <iostream>

using namespace std;

long long sum(std::vector<int> &a)
{
    long long ans = 0;

    for (const auto &element : a)
    {
        ans += element;
    }

    return ans;
}

int main()
{

    return 0;
}