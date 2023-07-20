# 30-algorithms-in-30-days 😄
<p align="center">
<img width="878" src="50 Algorithms In 50 Days.png" alt="50 Algorithms In 50 Days.png" alt="my banner"> </p>

My take on the idea of "50 Projects in 50 days" except with simple algorithms.<br/><br/>

### RandomGuess - Day 1 😝

This algorithm is a guessing game that generates a random number between 1 and 100 and asks the user to guess it. The program then tells the user if their guess was too high or too low. The algorithm continues to ask the user to guess until they guess the correct number.

### LinearSearch - Day 2 🔃

The linear search algorithm is a simple algorithm for finding an element in an array. It works by sequentially checking each element in the array until the element is found or the end of the array is reached. If the element is found, the algorithm returns the index of the element. If the element is not found, the algorithm returns -1.
The linear search algorithm is a very simple algorithm, but it is also very inefficient. The time complexity of the linear search algorithm is O(n), where n is the number of elements in the array. This means that the algorithm will take on average n/2 steps to find an element in the array.
The linear search algorithm is often used as a benchmark for other search algorithms. It is also used in situations where the array is small and the cost of comparing elements is low.

### Insertion Sort - Day 3 🔡

The above code implements Insertion Sort Algorithm in Java programming language which sorts elements by taking one at a time from unsorted part, comparing it with all previous sorted elements until its correct position is found where no larger number comes next or if there's already smaller numbers than current then swap them so that they come together properly without any gap between each other.<|im_sep|>

### Selection Sort - Day 4 ⬇️

The Selection Sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays: the left subarray is already sorted, and the right subarray is unsorted. In each iteration, the algorithm finds the minimum element in the unsorted subarray and swaps it with the first element of the unsorted subarray.

### Bubble Sort - Day 5 🗨️

The Bubble Sort algorithm is a simple sorting algorithm that works by repeatedly comparing adjacent elements in an array and swapping them if they are in the wrong order. The algorithm continues to do this until the array is sorted.
The Bubble Sort algorithm is inefficient for large arrays, but it is still a useful algorithm to learn because it is easy to understand and implement.

### Tree Traversal - Day 6 🎄

Tree traversal is an algorithm that visits all the nodes of a tree in a specific order. There are three main types of tree traversal algorithms: inorder, preorder, and postorder.
Inorder traversal visits the left subtree of a node, then the node itself, and then the right subtree. Preorder traversal visits the node itself, then the left subtree, and then the right subtree. Postorder traversal visits the right subtree of a node, then the left subtree, and then the node itself.

### Multiples of 3 and 5 - Day 7 📥

The algorithm is a simple program that sums the multiples of 3 and 5 from 1 to 1000. The program first initializes a variable called `sum` to 0. Then, it uses a for loop to iterate from 0 to 1000. In each iteration, the program checks if the current number is divisible by 3 or 5. If it is, the program adds the number to `sum`. Finally, the program prints the value of `sum` to the console.
The algorithm is simple and efficient. It runs in O(n) time, where n is the number of numbers from 1 to 1000.

### Heap Sort - Day 8

The heap sort algorithm is a sorting algorithm that works by building a heap, which is a data structure that is a complete binary tree in which the value of each node is greater than or equal to the values of its children. The heap sort algorithm works by repeatedly extracting the maximum element from the heap and placing it at the end of the sorted array. This process is repeated until the heap is empty, at which point the array will be sorted.
The heap sort algorithm is a very efficient sorting algorithm, and it has a time complexity of O(n log n). However, it is not a stable sorting algorithm, which means that it does not preserve the original order of equal elements in the array.

### Even Fibonacci Sequence - Day 9

The algorithm is a simple implementation of the Fibonacci sequence. The Fibonacci sequence is a sequence of numbers where each number is the sum of the two previous numbers. The first two numbers in the Fibonacci sequence are 0 and 1. The third number is 0 + 1 = 1. The fourth number is 1 + 1 = 2. The fifth number is 1 + 2 = 3. And so on.
The algorithm you provided works by first initializing two variables, firstNumber and secondNumber, to 0 and 1, respectively. It then iterates through the numbers from 0 to 4000000. In each iteration, it calculates the next number in the Fibonacci sequence by adding the previous two numbers. It then checks if the current number is even. If it is, it adds the number to the variable sumOfEven.
At the end of the algorithm, the variable sumOfEven will contain the sum of all the even numbers in the Fibonacci sequence up to 4000000.

### Largest Palindrome - Day 10

The algorithm is a simple brute force algorithm for finding the largest palindrome made from the product of two 3-digit numbers. It works by iterating through all possible pairs of 3-digit numbers and checking if the product of the two numbers is a palindrome. A palindrome is a number that reads the same backwards and forwards. The algorithm uses a simple function to check if a number is a palindrome. The function works by first converting the number to a string, then reversing the string, and then converting the reversed string back to a number. If the original number and the reversed number are equal, then the number is a palindrome.
The algorithm is simple to implement, but it is not very efficient. The time complexity of the algorithm is O(n^2), where n is the number of 3-digit numbers. This is because the algorithm has to iterate through all possible pairs of 3-digit numbers.
There are more efficient algorithms for finding the largest palindrome made from the product of two 3-digit numbers. One such algorithm is the Rabin-Karp algorithm. The Rabin-Karp algorithm works by first converting the two 3-digit numbers to strings. The algorithm then uses a hash function to hash the two strings. The hash function is a function that takes a string as input and returns a unique integer value. The algorithm then uses the hash function to find all possible palindromes that can be made from the two 3-digit numbers. The time complexity of the Rabin-Karp algorithm is O(n), where n is the length of the two 3-digit numbers.

### Fixed Array - Day 11

This algorithm merges two arrays into one. The program first asks the user to enter the size of the two arrays. Then, it creates two arrays of the specified size and a third array that will hold the merged arrays. The program then loops through the first array and adds each element to the third array. It then loops through the second array and adds each element to the third array, starting at the index where the first array ended. Finally, the program prints the merged array to the console.

### Sum Square Difference - Day 12

This algorithm is a simple program that takes a number as input and prints the sum of all the numbers from 1 to that number. The program first initializes a variable called sum to 0. It then loops from 1 to the input number, adding each number to the sum variable. Finally, the program prints the value of the sum variable.

### Multiplication Table - Day 13

The program starts by importing the Scanner class. This class allows the program to read input from the user.
The main method of the program then creates a Scanner object and prompts the user to enter the size of the multiplication table. The user input is stored in the variable x.
The program then uses a for loop to iterate through the values from 1 to x. For each value of i, the program uses another for loop to iterate through the values from 1 to i.
Inside the inner for loop, the program prints the value of i multiplied by j. The program then prints a new line.
After the inner for loop has finished iterating, the outer for loop increments i and repeats the process.
When the outer for loop has finished iterating, the program terminates.

### FLoat Stack Algorithm - Day 14

A float stack is a data structure that stores a list of floating-point numbers. It is similar to a stack, in that elements can only be added to the top of the stack or removed from the top of the stack. However, a float stack also supports the operation of peeking at the top element of the stack without removing it.
The following is an algorithm for implementing a float stack:
1. Create a new array to store the elements of the stack.
2. Initialize the stack pointer to -1.
3. To push an element onto the stack, do the following:
1. Increment the stack pointer.
2. Store the element at the index of the stack pointer.
4. To pop an element from the stack, do the following:
1. Decrement the stack pointer.
2. Return the element at the index of the stack pointer.
5. To peek at the top element of the stack, do the following:
1. Return the element at the index of the stack pointer.
The stack pointer is a variable that keeps track of the index of the top element of the stack. When an element is pushed onto the stack, the stack pointer is incremented. When an element is popped from the stack, the stack pointer is decremented.
The array used to store the elements of the stack must be large enough to hold all of the elements that will be pushed onto the stack. If the stack becomes full, an error will be thrown.
The float stack algorithm is a simple and efficient way to store a list of floating-point numbers. It is used in a variety of applications, such as computer graphics, scientific computing, and engineering.

### Reverse Addition - Day 15

The algorithm first asks the user to input two numbers. Then, it uses the reverseNum() method to reverse the order of the digits in each number. The reverseNum() method works by repeatedly dividing the number by 10 and taking the remainder. The remainder is then added to a running total, which is multiplied by 10 each time. This process continues until the number is 0. Finally, the algorithm adds the two reversed numbers together and prints the sum.

### Coin Sum Generator - Day 16

This algorithm generates the different ways to make a given amount of money using a set of coins. The algorithm works by first initializing an array of size num+1, where num is the amount of money to be made. The first element of the array is initialized to 1, as there is only one way to make 0 money.
For each coin in the set, the algorithm iterates through the array from coins[i] to num and adds ways[j-coins[i]] to ways[j]. This represents the number of ways to make j money using the first i coins, plus the number of ways to make j-coins[i] money using the first i coins.
The algorithm terminates when it has iterated through all of the coins in the set. The final value of ways[num] is the number of ways to make num money using the given set of coins.

### Password Generator - Day 17

The algorithm generates passwords of a given length by randomly selecting characters from a set of characters that includes numbers, symbols, and letters. The algorithm first selects a random number from 0 to 3, which represents the type of character to be generated. If the random number is 0, then a number is generated. If the random number is 1, then a symbol is generated. If the random number is 2, then a lowercase letter is generated. If the random number is 3, then an uppercase letter is generated. The generated character is then printed to the console. The algorithm repeats this process until the desired length of password has been generated.

### Ascii Value - Day 18

The algorithm is a simple program that takes a string as input and prints the total ASCII value of the string, as well as the ASCII value of each character in the string.
The program first declares a string variable called `c` and an integer variable called `totalValue`. It then prompts the user to enter a string and stores the input in the `c` variable.
The program then uses a for loop to iterate over the characters in the `c` variable. In each iteration, the program adds the ASCII value of the current character to the `totalValue` variable.
Once the for loop has finished, the program prints the total ASCII value of the string and the ASCII value of each character in the string.
The program is a simple example of how to use the ASCII value of a character. ASCII is a character encoding standard that assigns a unique number to each character in the English alphabet, as well as a number of other characters. The ASCII value of a character can be used to represent the character in a computer program.

### Pyramid Generator - Day 19

BLACKBOX AI
This algorithm is a program that prints a diamond shape. The program first asks the user to enter the number of rows in the diamond. Then, it uses a for loop to iterate over the rows. In each iteration, the program prints a number of spaces equal to the number of rows minus the current row number. Then, it prints a number of dollar signs equal to twice the current row number minus one. Finally, the program prints a newline character.
The program is a simple example of how to use for loops and conditional statements to control the flow of a program.

### Matrix Keypad - Day 20

This algorithm is a program that takes a string as input and outputs the same string, but with all the vowels removed. The vowels in the English language are: a, e, i, o, and u. The program uses a for loop to iterate over the characters in the input string. For each character, the program checks if it is a vowel. If the character is a vowel, the program removes it from the string. Otherwise, the character is left in the string. The program then outputs the resulting string.
The program is a simple example of how to use a for loop to iterate over a string. It is also a simple example of how to use the in operator to check if a character is a member of a set.

### Binary To Decimal Conversion - Day 21

This algorithm converts a binary number to a decimal number. The algorithm first takes a binary number as input. It then iterates over the binary number, starting from the rightmost digit. For each digit, the algorithm multiplies the digit by 2 to the power of the current index. The algorithm then adds the results of these multiplications to get the decimal equivalent of the binary number.
The algorithm is a simple example of how to convert a binary number to a decimal number. It is also a simple example of how to use the pow() function to raise a number to a power.

### Character Frequency - Day 22

This algorithm takes in a string and a character as input and returns the number of times the character appears in the string. The algorithm first gets the input string and character from the user. Then, it iterates through the string character by character and checks if the current character is equal to the character to find. If it is, the algorithm increments a counter. After the iteration is complete, the algorithm prints the value of the counter.

### Matrix - Day 23

This algorithm takes in two matrices and performs either multiplication or addition on them, depending on the user's choice. The algorithm first checks to make sure that the matrices are compatible for multiplication, and if not, it prompts the user to enter new matrices. Once the matrices are compatible, the algorithm initializes two new matrices to hold the results of the multiplication or addition. The algorithm then loops through the matrices, multiplying or adding the corresponding elements together and storing the results in the new matrices. Finally, the algorithm prints out the results of the multiplication or addition.

### Student Marking System: Day 24

This algorithm defines an abstract class Module and three subclasses EX002, CE003, and CW001, each representing different modules for a student. The Module abstract class has attributes for the module name, status, and final mark. It also has getter and setter methods for these attributes. The subclasses represent specific modules and have additional attributes and methods for handling module-specific data.

The Student class represents a student and has attributes for their first name, surname, and instances of the CW001, EX002, and CE003 classes to represent their marks in these modules. The Student class also has methods to print the student details along with their marks in different modules.

The Main class is the entry point of the program and contains the main method. It allows the user to input details for multiple students and their module marks. It then provides a menu-driven interface to print the module marks for each student or for a specific module.

Overall, this program is designed to manage and display module marks for multiple students, allowing users to view marks for all modules or specific modules through a simple text-based menu interface. The code is organized and follows object-oriented principles, making it easy to extend for additional modules or features.

### Binary Search Tree - Day 25

This algorithm is a recursive algorithm that takes as input a binary search tree and a target value. The algorithm first checks if the target value is equal to the root of the tree. If it is, then the algorithm returns true. Otherwise, the algorithm recursively checks if the target value is less than or greater than the root of the tree. If the target value is less than the root, then the algorithm recursively searches the left subtree of the tree. If the target value is greater than the root, then the algorithm recursively searches the right subtree of the tree. The algorithm terminates when the target value is found or when the entire tree has been searched.

### Binary Overloading - Day 26

This algorithm implements the operator overloading for the subtraction operator (-) for the class Complex. The class Complex has two private members, real and imag, which store the real and imaginary parts of a complex number. The class also has a constructor that initializes the real and imaginary parts to 0, and a method input() that reads the real and imaginary parts from the user. The operator overloading for the subtraction operator subtracts the real and imaginary parts of the second complex number from the real and imaginary parts of the first complex number, and returns the result as a new Complex object. The method output() prints the real and imaginary parts of the complex number.

### Factorial Recursion - Day 27

This algorithm takes an integer as input and prints its factorial. The factorial of a number is the product of all the integers from 1 to that number. The program uses a recursive function to calculate the factorial. The function takes the number as input and recursively calls itself to calculate the factorial of the number minus 1. The function returns the product of the number and the factorial of the number minus 1.

### Binary Tree Node - Day 28

This program defines a class TreeNodes to represent a node in a binary tree. The class has three attributes: item, left, and right. The item attribute stores the data of the node, the left attribute stores the left child of the node, and the right attribute stores the right child of the node. The class also defines a method is_leaf() to check if the node is a leaf node.
The program also defines a class BinaryTree to represent a binary tree. The class has one attribute: root. The root attribute stores the root node of the tree. The class also defines a method dominates() to check if the tree is a dominating tree. The method recursively checks if all the nodes in the tree are greater than or equal to their children.
The program then creates a binary tree and prints the result of the dominates() method. The tree is a dominating tree because all the nodes are greater than or equal to their children.

### Greatest Common Divider - Day 29

This algorithm is a simple implementation of the Euclidean algorithm for finding the greatest common divisor (GCD) of two integers. The algorithm works by repeatedly subtracting the smaller integer from the larger integer until the remainder is zero. The final remainder is the GCD of the two integers.
The algorithm is implemented in Java. The program first prompts the user to enter two integers. The integers are then read from the console using the Scanner class. The GCD of the two integers is then calculated using the Euclidean algorithm. The result is printed to the console.
The algorithm is correct and efficient. It runs in O(log(n)) time, where n is the larger of the two integers.

### Permutation - Day 30

This algorithm is a next permutation algorithm. It takes a vector of integers as input and returns a new vector with the next permutation of the elements in the input vector.
The algorithm works by first finding the first element in the input vector that is smaller than the element to its right. This element is called the pivot. The algorithm then swaps the pivot with the element to its right that is largest and still less than the pivot. Finally, the algorithm reverses the order of the elements in the input vector after the pivot.
The algorithm is correct because it always produces a new vector with a permutation of the elements in the input vector that is lexicographically greater than the input vector. The algorithm is also efficient because it runs in O(n) time, where n is the number of elements in the input vector.
