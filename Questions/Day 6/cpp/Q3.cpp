#include <iostream>
#include <cmath>

using namespace std;

int fact(int n)
{
    int fact = 1;
    for (int i = n; i > 0; i--)
    {
        fact = fact * i;
    }
    return fact;
}

int series(int n)
{
    int sum = 0;

    for (int i = 1; i <= n; ++i)
    {
        int numerator = ((i + 1) * (i + 2)) / 2;
        int denominator = fact(i + 1);

        sum = sum + (numerator / denominator);
    }

    return sum;
}

int main()
{
    int n = 0;
    cin >> n;

    cout << series(n);

    return 0;
}