#include <iostream>
using namespace std;

void diamond()
{
    for (int i = 1; i <= 5; i++)
    {
        for (int j = i; j < 5; j++)
        {
            cout << " ";
        }

        for (int j = 1; j <= 2 * i - 1; ++j)
        {
            cout << "*";
        }
        cout << endl;
    }

    for (int i = 4; i > 0; --i)
    {
        for (int j = i; j <= 4; ++j)
        {
            cout << " ";
        }

        for (int j = 1; j <= 2 * i - 1; ++j)
        {
            cout << "*";
        }
        cout << endl;
    }
}
int main()
{
    diamond();
    return 0;
}