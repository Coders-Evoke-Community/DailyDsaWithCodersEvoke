#include <iostream>
using namespace std;

int main()
{
    int a = 0;
    cout << "Enter a: ";
    cin >> a;

    int b = 0;
    cout << "Enter b: ";
    cin >> b;

    cout << "\nAddition of a and b is " << (a + b);
    cout << "\nSubtraction of a and b is " << (a - b);
    cout << "\nDivision of a and b is " << (a / b);
    cout << "\nMultiplication of a and b is " << (a * b);

    return 0;
}