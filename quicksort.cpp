// quick sort

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int partition(int arr[], int s, int e)
{
    int pivot = arr[s];

    int count = 0;
    for (int i = s+1; i <= e; i++)
    {
        if (arr[i] <= pivot)
        {
            count++;
        }
    }

    // placing the pivot in its right position

    int rightposition = s + count ;

    swap(arr[rightposition], arr[s]);

    // ab left aur right waala part sambhal lete hai
    int i = s, j = e;
    while (i < rightposition && j > rightposition)
    {
        while (arr[i] <= pivot)
        {
            i++;
        }
        while (arr[j] > pivot)
        {
            j--;
        }
        if (i < rightposition && j > rightposition)
        {
            swap(arr[i++], arr[j--]);
        }
    }
    return rightposition;
}

void quicksort(int arr[], int s, int e)
{

    while (s >= e)
    {
        return;
    }

    int p = partition(arr, s, e);

    quicksort(arr, s, p - 1);
    quicksort(arr, p + 1, e);
}
int main()
{
    int arr[10] = {44, 35, 6, 7, 8, 4, 75, 31, 49, 1};
    int n = 10;

    quicksort(arr, 0, n - 1);

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}