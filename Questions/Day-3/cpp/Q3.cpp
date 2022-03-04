#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int n = 0;
    cin>>n;

    int a = 0, b = 1, c = 0;
    cout<<a<<" "<<b;

    while (n > 2)
    {
        c = a + b;
        cout<<" "<<c;
        a = b;
        b = c;
        n = n - 1;
    }
    return 0;
}