// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int pivotindex(int arr, int n)
{
    int s = 0;
    int e = n - 1;
    int mid = s + (e - s) / 2;
    int sumleft = 0;
    int sumright = 0;

    while (s < e)
    {
        for (int i = 0; i < mid; i++)
        {
            sumleft = arr[i] + sumleft;
            return sumleft;
        }
        for (int i = mid;  i < e; i++)
        {
            sumright = arr[i] + sumright;
            return sumright;
        }
        mid = s + (e - s) / 2;
    }
    if (sumleft == sumright)
    {
        return i;
    }
    else{
        return -1;
    }
}

int main()
{
    int arr[6] = {1, 7, 3, 6, 5, 6};

    pivotindex(arr, 6);

    return 0;
}