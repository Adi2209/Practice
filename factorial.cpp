#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int factorial(int n)
{

    if (n < 0)
    {
        return -1;
    }

    if (n == 0)
    {

        return 1;
    }

    else
    {
       return n *(factorial(n - 1));
    }
}

int main()
{
    int n;
    cin >> n;

    cout << "The value of factorial " << n << " is: " << factorial(n) << endl;

    return 0;
}