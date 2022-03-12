// find pivot in a sorted and rotated array .

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int pivotindex(int arr[], int n)
{
    int s = 0;
    int e = n - 1;
    int mid = s + (e - s) / 2;
    while (s < e)
    {
        mid = s + (e - s) / 2;
        if (arr[mid] > arr[0])
        {
            s = mid + 1;
        }

        else
        {
            e = mid;
        }
    }
}

int main()
{

    int arr[7] = {6, 7, 1, 2, 3, 4, 5};

    cout<<"Pivot is : "<<pivotindex(arr, 7)<<endl;

    return 0;
}