// find the first and last occurence of an element in an array

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int firstocc(int arr[], int n, int key)
{
    int s = 0;
    int e = n - 1;
    int ans = 0;
    int mid = s + (e - s) / 2;
    while (s <= e)
    {
        mid = s + (e - s) / 2;
        if (arr[mid] == key)
        {
            ans = mid;
            e = mid - 1;
        }
        else if (arr[mid] < key)
        {
            s = mid + 1;
        }
        else if (arr[mid] > key)
        {
            e = mid - 1;
        }
    }
    return ans;
    
}
int lastocc(int arr[], int n, int key)
{
    int s = 0;
    int e = n - 1;
    int ans = 0;
    int mid = s + (e - s) / 2;
    while (s <= e)
    {
        mid = s + (e - s) / 2;
        if (arr[mid] == key)
        {
            ans = mid;
            s = mid + 1;
        }
        else if (arr[mid] < key)
        {
            s = mid + 1;
        }
        else if (arr[mid] > key)
        {
            e = mid - 1;
        }
        
        
    }
    return ans;
    
}

int main()
{
   
    int key;
    cout << "Enter the key :" << endl;
    cin >> key;

    int arr[11] = {1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 6};

    cout << "The element's first occurence is at index : " << firstocc(arr, 11, key) << endl;
    cout << "The element's last occurence is at index : " << lastocc(arr, 11, key) << endl;

    return 0;
}