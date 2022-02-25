#include <iostream>
#include <climits>
using namespace std;

int main()
{
    int n, key;
    cout << "Enter the size of array: " << endl;
    cin >> n;

    int a[1000];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    //Algo to find the largest and the smallest number

    int largest = INT_MIN;
    int smallest = INT_MAX;

    for (int i = 0; i < n; i++)
    {
        largest = max(largest, a[i]);
        smallest = min(smallest, a[i]);

    }
    cout << "Largest is " << largest << "  Smallest is " << smallest << endl;

    return 0;
}