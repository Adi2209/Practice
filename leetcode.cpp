// find if the given int is a power of 2

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool powerof(int n)
{
    int temp = 0;

    while (temp > 0)
    {

        n % 2 == temp;

        return 1;
    }
}
    int main()
    {

        int n;
        cin >> n;

        cout << powerof(n);

        return 0;
    }