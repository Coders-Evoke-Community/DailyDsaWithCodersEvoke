#include <iostream>
using namespace std;

void sandglass() {
        for (int i=5; i>0; --i) {
            for (int j=i; j<5; ++j) {
                cout<<" ";
            }
            for(int j=i; j> 0; --j) {
                cout<<"* ";
            }
            cout<<endl;
        }
        for (int i=1; i<=5; ++i) {
            for (int j=i; j<5; ++j) {
                cout<<" ";
            }
            for(int j=i; j> 0; --j) {
                cout<<"* ";
            }
            cout<<endl;
        }
    }
int main()
{
    sandglass(); 
    return 0;
}