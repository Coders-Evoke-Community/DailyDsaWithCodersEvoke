#include <iostream>
using namespace std;

void hollowDiamond() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 5; j > i; --j) {
                cout<<" ";
            }
            if (i != 1)
                cout<<"*";
            for (int j = 1; j < (i - 1) * 2; ++j) {
                cout<<" ";
            }
            cout<<"*"<<endl;
        }
        for (int i = 5; i > 0; --i) {
            for (int j = 5; j > i; --j) {
                cout<<" ";
            }
            if (i != 1)
                cout<<"*";
            for (int j = 1; j < (i - 1) * 2; ++j) {
                cout<<" ";
            }
            cout<<"*"<<endl;
        }
    }
int main()
{
    hollowDiamond(); 
    return 0;
}