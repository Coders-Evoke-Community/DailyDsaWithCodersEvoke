#include <iostream>
#include<cmath>

using namespace std;

int series(int n, int x)
{
    int sum = 0;

    for (int i = 1; i <= n; ++i)
    {
        int num = (int) pow(x, i);

        if (i % 2 == 0)
        {
            num = num * -1;
        }

        sum += num;
    }

    return sum;
}

int main()
{
    int n = 0;
    cin >> n;

    cout << series(n,2);

    return 0;
}