#include <iostream>
using namespace std;

int main()
{
    cout << "Enter a: ";
    int a = 0;
    cin >> a;

    cout << "Enter b: ";
    int b = 0;
    cin >> b;

    cout << "Enter c: ";
    int c = 0;
    cin >> c;

    int max = INT8_MIN;
    if (a >= max)
        max = a;
    if (b >= max)
        max = b;
    if (c >= max)
        max = c;

    cout << "\nMax Value: " << max;

    int min = INT8_MAX;
    if (a <= min)
        min = a;
    if (b <= min)
        min = b;
    if (c <= min)
        min = c;

    cout << "\nMin Value: " << min;

    return 0;
}