#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void swap(int arr[], int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void selectionSort(int arr[], int i, int n)
{

    // cout << endl;
    // base case
    // if (n == 0 || n == 1)
    // {
    //     return true;
    // }
    // ek ke liye kar do
    int mini = i;
    for (int j = i + 1; j < n; j++)
    {
        if (arr[j] < arr[mini])
        {
            mini = j;
        }
    }
    swap(arr, mini, i);

    if (i + 1 < n)
    {
        selectionSort(arr, i + 1, n);
    }

    //     }
    //     int temp = arr[mini];
    //     arr[mini] = arr[i];
    //     arr[mini] = temp;

    //     if (i + 1 < n) {
    //         selectionSort(arr, i + 1, n);
    //     }

    // recursive call
    // return selectionSort(arr, n - 1);
    // return false;
}

int main()
{
    int arr[7] = {4, 23, 2, 35, 3, 21, 27};

    selectionSort(arr, 0, 7);

    for (int i = 0; i < 7; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}