//wacp to swap alternate int

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
  int n;
  cout<<"Enter the size of array  : "<<endl;
  int arr[n];
  cout<<"Enter the elements of the array : "<<endl;
  for (int i = 0; i < n; i++)
  {
      cin>>arr[i];
  }
  for(int i=0;i<n;i++){
    swap(arr[i],arr[i+1]);
  }

  for (int i = 0; i < n; i++)
  {
      cout<<arr[i]<<" ";
  }
    return 0;
}
