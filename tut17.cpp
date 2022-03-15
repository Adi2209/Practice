#include<iostream>
using namespace std;

int main(){
int row ;
 int col;
cout<<"Enter the no of rows: "<<endl;
cin>>row;
    cout<<"Enter the no of columns: "<<endl;
    cin>>col;
    for ( int i = 1; i >=1; i++)
     for (int j = 1; j <= i; j--)
     {
            cout<<"*";
        cout<<endl;

     };
     
    

    
    return 0;
}