#include <iostream>
#include <cmath>
using namespace std;

bool isPalindrome(int n)
{
    int temp = n;
    int rem = 0, sum = 0;
    while (n > 0)
    {
        rem = n % 10;
        sum = (sum * 10) + rem;
        n = n / 10;
    }
    if (temp == sum)
        return true;
    return false;
}

int main()
{
    int n = 0;
    cin >> n;

    if (isPalindrome(n))
    {
        cout << "Palindrome number";
    }
    else
    {
        cout << "Not Palindrome";
    }

    return 0;
}