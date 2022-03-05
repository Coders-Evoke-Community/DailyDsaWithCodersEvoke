#include <iostream>
using namespace std;

int factorial(int n)
{
    if (n == 0)
        return 1;

    int fact = 1;
    for (int i = n; i > 1; --i)
    {
        fact = fact * i;
    }
    return fact;
}

void pascalTriangle()
{
    int n = 4, i, j;

    for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= n - i; j++)
        {
            cout<<" ";
        }
        for (j = 0; j <= i; j++)
        {
            cout<<" "<<(factorial(i) / (factorial(i - j) * factorial(j)));
        }
        cout<<endl;
    }
}

int main()
{
    pascalTriangle();
    return 0;
}