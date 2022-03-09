// find the sum of all the numbers of an array :)
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int sumofarray(int n, int arr[])
{
    int sum=0;

    for (int i = 0; i < n ; i++)
    {
        sum=sum+arr[i];

        
    }
    cout << "The sum of all the numbers in the array is : " << sum << endl;
    return sum;
}

int main()
{

    int n;
    cin >> n;
    int arr[100];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    sumofarray(n, arr);

    return 0;
}


