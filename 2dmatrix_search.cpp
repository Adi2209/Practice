// 2d matrix search without the brute force algo ...xD

#include <iostream>
using namespace std;

int main()
{

    int n, m, target;
    cin >> n >> m >> target;
    int arr[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }
    }
    int r = 0, c = m - 1;
    bool ans = false;

    while (r < n && c >= 0)
    {
        if (arr[r][c] == target)
        {

            ans = true;
        }
        else if (arr[r][c] > target)
        {
            c--;
        }
        else
        {
            r++;
        }
    }
    if (ans)
    {
        cout << "Element Found !" << endl;
    }
    else
    {
        cout << "Element does not exist" << endl;
    }

    return 0;
}