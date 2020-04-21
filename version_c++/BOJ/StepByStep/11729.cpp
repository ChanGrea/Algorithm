#include <iostream>

using namespace std;

void move(int from, int to)
{
    cout << from << ' ' << to << endl;
}

// n is cnt
// f is from
// t is to
void hanoi(int n, int f, int t)
{
    if (n != 0)
    {
        /*
         원반이 1,2,3 이라면
         1 + 2 + 3 = 6이고
         
         f : 1
         t : 3이라면
         
         1번 원판에 가장 아래를 제외하고
         나머지 원판들은 2(= 6-1-3 )로 가야한다.
         */
        hanoi(n - 1, f, 6 - f - t);
        printf("%d %d\n", f, t);
        hanoi(n - 1, 6 - f - t, t);
    }
}

int main()
{
    int n;
    cin >> n;

    cout << (1 << n) - 1 << endl;
    hanoi(n, 1, 3);

    return 0;
}