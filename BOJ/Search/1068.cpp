#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n][n];
    bool visited[n];
    int count = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            arr[i][j] = 0;
        }
    }

    for (int i = 0; i < n; i++)
    {
        int p;
        scanf("%d", &p);
        if (p != -1)
        {
            arr[p][i] = 1;
        }
    }

    int remove;
    cin >> remove;

    for (int i = 0; i < n; i++)
    {
        arr[remove][i] = 0;
        arr[i][remove] = 0;
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    bool isLeaf = true;
    for (int i = 0; i < n; i++)
    {
        if (!visited[i])
        {
            int child = -1;
            for (int j = 0; j < n; j++)
            {
                if (arr[i][j] == 1)
                {
                    child = j;
                    cout << child << "\n";
                    for (int k = 0; k < n; k++)
                    {
                        if (arr[child][k] == 1)
                            break;

                        if (k == n - 1)
                            count++;
                    }
                    visited[child] = true;
                }
            }
        }
        visited[i] = true;
    }

    cout << count << "\n";

    return 0;
}