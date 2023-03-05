#include <iostream>
using namespace std;

int AsciiValue() {
    string c;
    int totalValue;
    cout << "Enter a String : ";
    cin >> c;
    for (int i=0; i<c.length() ; i++){

        totalValue += int(c[i]);
    }
    cout << "Total AASCI value of string " << c << " is " << totalValue << "\n";
    cout << "----- Character ASCII value -----" << "\n";
    for (int i=0; i<c.length(); i++){
        cout << c[i] << " : " << int(c[i]) << "\n";
    }
    return 0;
}
