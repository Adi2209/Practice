#include <iostream>
using namespace std;

int main()
{

    int n, key;

    cin >> n;

    int a[1000];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cout << "Enter the element you want to search : ";
    cin >> key;

    //linear search algo
    int i;
    for (i = 0; i <= n - 1; i++)
    {   
        if (a[i] == key)
        {
            cout << key << "Found at the" << i << "index";
            break;
        }
        if(i==n){
            cout<<key<<"Is not present "<<endl;
        }
    }

    return 0;
}