#include <iostream>
#include <cmath>
using namespace std;

int main()
{

    int n = 0;
    cin >> n;

    int temp = n;
    int rem = 0, sum = 0;
    while (n > 0)
    {
        rem = n % 10;
        sum = (sum * 10) + rem;
        n = n / 10;
    }
    if (temp == sum)
        cout << "palindrome number ";
    else
        cout << "not palindrome";

    return 0;
}