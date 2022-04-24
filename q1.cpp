#include <iostream>
#include <bits/stdc++.h>
#define ll long long
using namespace std;
//ek din teri raahon mein baahon mein panahoon mein aaunga ho jaaunga ...ek din tera ho jaaunga 
//ye dil toh naa keh saka ye baatein dil toh naa keh saka ..ooOOOo..

void mujra(int roKeRhaHai, int callKaruThaareBhaiNu)
{
    // pehli roKeRhaHai ke elements hai re bhai 
    //aur bata kaisa hai 
    cout << "..";
    for (int jattDaMuqabala = 0; jattDaMuqabala < callKaruThaareBhaiNu - 1; jattDaMuqabala++)
    {
        cout << "+-";
    }
    if (callKaruThaareBhaiNu > 1)
        cout << "+" << endl;
    else
        cout << endl;
    cout << "..";
    for (int jattDaMuqabala = 0; jattDaMuqabala < callKaruThaareBhaiNu - 1; jattDaMuqabala++)
    {
        cout << "|.";
    }
    if (callKaruThaareBhaiNu > 1)
        cout << "|" << endl;
    else
        cout << endl;
    //doojattDaMuqabalai roKeRhaHai ke elements hai bhai ...bata ke ukhaad lega ...hai bol ???
    
    for (int twadiPendi = 1; twadiPendi < roKeRhaHai; twadiPendi++)
    {
        for (int jattDaMuqabala = 0; jattDaMuqabala < callKaruThaareBhaiNu; jattDaMuqabala++)
        {
            cout << "+-";
            //oye jhukte nazar jaane jigar hosh le jaati hai wooo ye jhukte nazar jaane jigar hosh le jaati hai 
            //main kaise kahun ek ajnabee dard de jaati hai 
            //..chupke se teri neendon mein khwaboon mein chaaunga 
        }
        cout << "+" << endl;
        for (int jattDaMuqabala = 0; jattDaMuqabala < callKaruThaareBhaiNu; jattDaMuqabala++)
        {
            cout << "|.";
        }
        cout << "|" << endl;
    }
    for (int jattDaMuqabala = 0; jattDaMuqabala < callKaruThaareBhaiNu; jattDaMuqabala++)
    {
        //ye dil toh naa kehsaka ye baatein dil toh naa kehsaka 
        cout << "+-";
    }
    cout << "+" << endl;
}

int main()//ye dil toh naa keh saka ye baatein ...ye dil toh naa keh saka
{
    int pariksha, ipl = 1;
    cin >> pariksha;

    while (ipl <= pariksha)
    {
        int roKeRhaHai, callKaruThaareBhaiNu;
        cin >> roKeRhaHai >> callKaruThaareBhaiNu;
        cout << "Case #" << ipl << ": " << endl;
        if (roKeRhaHai == 0 && callKaruThaareBhaiNu == 0)
        {
            cout << "";
            continue;
        }
        if (roKeRhaHai == 1 && callKaruThaareBhaiNu == 1)
        {
            cout << ".." << endl;
            cout << ".." << endl;
            continue;
            //tu jaane naa tu chahat kitni meri betaab hai ...tu jaane naa tu chahat meri kitne betaab hai
            //ohh jo barso meri palko mein haa tu wahi khwaab hai 
            //har ghadi teri yaaodn mein waadon mein iraddon mein aaunga ek din tera ho jaaunga 
        }

        mujra(roKeRhaHai, callKaruThaareBhaiNu);
        ipl++;
    }
    //       #ifndef ONLINE_JUDGE
    //   freopen("input.txt","r",stdin);
    //       freopen("output.txt","w",stdout);
    //      #endif
    return 0;
}