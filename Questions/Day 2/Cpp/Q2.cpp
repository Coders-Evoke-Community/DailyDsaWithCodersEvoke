#include <iostream>
using namespace std;

int main()
{
    cout << "Enter number: ";
    int num = 0;
    cin >> num;

    if (num % 2 == 0)
    {
        cout << "Even";
    }
    else
    {
        cout << "Odd";
    }

    return 0;
}