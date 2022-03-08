#include<iostream>
#include <bits/stdc++.h>
#include<limits.h>
using namespace std;

int main(){
    int a[100];
    int n;
    cin>>n;
  
  for (int i = 0; i < n; i++)
  {
      cin>>a[i];
  }
int largest = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        largest = max(largest, a[i]);
    }
  cout<<"The largest number in the array is :  "<<n<<endl;

   int smallest= INT_MAX;

    for (int i = 0; i < n; i++)
    {
        smallest = max(smallest, a[i]);
    }
  cout<<"The largest number in the array is :  "<<n<<endl;

    return 0;
}