#include <bits/stdc++.h>

using namespace std;
int main()
{
    int p=0,ne=0,ze=0;
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<n;i++)
    {
    if(arr[i]>0)
    {
        p++;
    }
    else if(arr[i]<0)
    {
        ne++;
    }
    else{
        ze++;
    }
    }
    cout<<fixed<<setprecision(6)<<(float)p/n<<endl;
    cout<<fixed<<setprecision(6)<<(float)ne/n<<endl;
    cout<<fixed<<setprecision(6)<<(float)ze/n<<endl;


    
}