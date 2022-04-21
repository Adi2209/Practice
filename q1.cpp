#include <iostream>
#include <bits/stdc++.h>
#include <cmath>
using namespace std;

class funn
{
public:
    void answer()
    {

        double n;

        cin >> n;

        double x = pow(0.143 * n, n);

        cout << round(x) << endl;
    }
};

int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    //       #ifndef ONLINE_JUDGE
    //   freopen("input.txt","r",stdin);
    //       freopen("output.txt","w",stdout);
    //      #endif
    int t;
    cin >> t;
    funn ob;
    while (t--)
    {
        ob.answer();
    }
    return 0;
}
