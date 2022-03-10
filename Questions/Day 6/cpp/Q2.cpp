#include <iostream>
#include <cmath>

using namespace std;

int series(int n, int x)
{
    int sum = 0;

    for (int i = 1, j = 1; i <= n; ++i, j = j + 2)
    {
        int num = (int) pow(x, i) / j;

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

    cout << series(n, 2);

    return 0;
}