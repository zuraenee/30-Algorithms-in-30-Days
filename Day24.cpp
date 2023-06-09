#include <iostream>
#include <cmath>
using namespace std;

float standardDeviation(float dataSD[]);

int main() {
  int x;
  float dataSD[10];

  cout << "Enter 10 elements: ";
  for(x = 0; x < 10; ++x) {
    cin >> dataSD[x];
  }

  cout << endl << "Standard Deviation = " << standardDeviation(dataSD);

  return 0;
}

float standardDeviation(float dataSD[]) {
  float sum = 0.0, mean, SDValue = 0.0;
  int i;

  for(i = 0; i < 10; ++i) {
    sum += dataSD[i];
  }

  mean = sum / 10;

  for(i = 0; i < 10; ++i) {
    SDValue += pow(dataSD[i] - mean, 2);
  }

  return sqrt(SDValue / 10);
}
