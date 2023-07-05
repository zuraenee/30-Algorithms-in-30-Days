include <iostream>
include <cmath>

using namespace std;

int main() {
  long long n;
  cout << "Enter a binary number: ";
  cin >> n;
  cout << n << " in binary = " << convertion(n) << " in decimal";
  return 0;
}

int convertion(long long);

int convertion(long long n) {
  int decimal = 0, i = 0, reminder;

  while (n!=0) {
    reminder = n % 10;
    n /= 10;
    decimal += reminder * pow(2, i);
    ++i;
  }

  return decimal;
}
