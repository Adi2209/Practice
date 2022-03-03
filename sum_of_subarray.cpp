#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    int csum = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            csum += a[j];
            cout << "The sum is as follows :  " << csum << endl;
        }
        
    }

    return 0;
}