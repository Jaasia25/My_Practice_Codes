#include <iostream>
using namespace std;

void Addition(int &x) {
            x = x + 5;
            cout << "Value =\t" << x << endl;
        }

int main() {
        int a = 10;
        cout << "Before function call\t" << a <<endl;
        Addition(a);
        cout << "After function call\t" << a <<endl;
        }


