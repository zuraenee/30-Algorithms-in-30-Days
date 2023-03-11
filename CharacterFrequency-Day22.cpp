#include <iostream>
using namespace std;

int main(){
    string sentence;
    char charToFind;
    int count=0;
    cout << "Enter a String : ";
    getline(cin, sentence); //cin considers whitespace as a terminating character so we use getline(cin,sentence)
    cout << "Enter a character in the string to find : ";
    cin >> charToFind;
    for (int i=0; i<sentence.size(); i++){
        //cout << sentence[i] << endl; (if i want to print line by line)
        if (sentence[i] == charToFind){
            count++;
        }
    }
    cout << "The number of times the letter (" << charToFind << ") appeared in (" << sentence << ") is " << count;
    return 0;
}
