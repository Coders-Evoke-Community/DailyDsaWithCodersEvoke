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

    cout << "Calculator\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division";

    cout << "Enter your choice: ";
    int choice = 0;
    cin >> choice;

    switch (choice)
    {
    case 1:
        cout << "\nAddition: " << (a + b);
        break;
    case 2:
        cout << "\nSubtraction: " << (a - b);
        break;
    case 3:
        cout << "\nMultiplication: " << (a * b);
        break;
    case 4:
        cout << "\nDivision: " << (a / b);
        break;
    default:
        cout << "Invalid Operation";
        break;
    }
}