#include <iostream>
using namespace std;

int main() {
    int matrix1[0][0], matrix2[0][0], row1, col1, row2, col2, choice, multiplication[0][0], subtraction[0][0], addition[0][0];
    bool validChoice=false;
    cout << "Matrix 1" << endl;
    cout << "Enter Size of Row : ";
    cin >> row1;
    cout << "Enter Size of Column : ";
    cin >> col1;
    cout << "Matrix 2" << endl;
    cout << "Enter Size of Row : ";
    cin >> row2;
    cout << "Enter Size of Column : ";
    cin >> col2;

    // column matrix1 must match row matrix2 for multiplication to happen
    while (col1!=row2){
        cout << "Size of Column for Matrix 1 must match Size of Row for Matrix 2 " << endl;
        cout << "=== Matrix 1 ===" << endl;
        cout << "Enter Size of Row : ";
        cin >> row1;
        cout << "Enter Size of Column : ";
        cin >> col1;
        cout << "=== Matrix 2 ===" << endl;
        cout << "Enter Size of Row : ";
        cin >> row2;
        cout << "Enter Size of Column : ";
        cin >> col2;
    }

    cout << "====== Enter elements of Matrix 1 ======" << endl;
    for (int i=0; i<row1; i++){
        for (int j=0; j<col1; j++){
            cout << "Element Row " << i << " Column " << j << " : ";
            cin >> matrix1[row1][col1];
        }
    }

    cout << "====== Enter elements of Matrix 2 ======" << endl;
    for (int i=0; i<row2; i++){
        for (int j=0; j<col2; j++){
            cout << "Element Row " << i << " Column " << j << " : ";
            cin >> matrix2[row2][col2];
        }
    }

    while (validChoice == false ) {
        cout << "SELECT WHICH ACTION YOU WOULD LIKE TO DO : " << endl;
        cout << "1. Multiplication" << endl << "2. Addition" << endl;
        cin >> choice;
        if (choice == 1) {
            cout << "==== Multiplication ====";
            //initializing multiplication matrix, or else the value would not start from 0
            for (int i=0;i<row1;i++){
                for(int j=0; j<col2;j++){
                    multiplication[i][j] = 0;
                }
            }
            //putting it into the multiplication table
            for (int i=0; i<row1; i++){
                for (int j=0; j<col2; j++){
                    for(int l=0; l<col1; l++){
                        multiplication[i][j]  += matrix1[i][l] * matrix2[l][j];
                    }
                }
            }
            //printing out the value
            for (int i=0; i<row1; i++)
            for (int j=0; j<col2; j++){
                cout << " " << multiplication[i][j];
                if (j == col2-1){
                    cout << endl;
                }
            }

            validChoice = true;
        }
        else if (choice == 2) {
            //initializing addition matrix, or else the value would not start from 0
            for (int i=0;i<row1;i++){
                for(int j=0; j<col2;j++){
                    multiplication[i][j] = 0;
                }
            }
            //putting it in the addition table
            for (int i=0;i<row1;i++){
                for(int j=0; j<col2;j++){
                    addition[i][j] = matrix1[i][j] + matrix2[i][j];

                }
            }
            //printing out the value
            for(int i = 0; i < row1; ++i)
                for(int j = 0; j < col2; ++j)
                {
                    cout << addition[i][j] << "  ";
                    if(j == col2 - 1)
                        cout << endl;
                }


            validChoice = true;
        }
        else {
            validChoice = false;
            cout << "Enter a valid choice between 1, 2, 3";
        }
    }
    return 0;
    //value returned is not correct
}
