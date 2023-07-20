# 30-algorithms-in-30-days
<p align="center">
<img width="878" src="50 Algorithms In 50 Days.png" alt="50 Algorithms In 50 Days.png" alt="my banner"> </p>

My take on the idea of "50 Projects in 50 days" except with simple algorithms.<br/><br/>

### RandomGuess - Day 1

This algorithm is a guessing game that generates a random number between 1 and 100 and asks the user to guess it. The program then tells the user if their guess was too high or too low. The algorithm continues to ask the user to guess until they guess the correct number.

### LinearSearch - Day 2

The linear search algorithm is a simple algorithm for finding an element in an array. It works by sequentially checking each element in the array until the element is found or the end of the array is reached. If the element is found, the algorithm returns the index of the element. If the element is not found, the algorithm returns -1.
The linear search algorithm is a very simple algorithm, but it is also very inefficient. The time complexity of the linear search algorithm is O(n), where n is the number of elements in the array. This means that the algorithm will take on average n/2 steps to find an element in the array.
The linear search algorithm is often used as a benchmark for other search algorithms. It is also used in situations where the array is small and the cost of comparing elements is low.

### Insertion Sort - Day 3

The above code implements Insertion Sort Algorithm in Java programming language which sorts elements by taking one at a time from unsorted part, comparing it with all previous sorted elements until its correct position is found where no larger number comes next or if there's already smaller numbers than current then swap them so that they come together properly without any gap between each other.<|im_sep|>

### Selection Sort - Day 4

The Selection Sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays: the left subarray is already sorted, and the right subarray is unsorted. In each iteration, the algorithm finds the minimum element in the unsorted subarray and swaps it with the first element of the unsorted subarray.

### Bubble Sort - Day 5

The Bubble Sort algorithm is a simple sorting algorithm that works by repeatedly comparing adjacent elements in an array and swapping them if they are in the wrong order. The algorithm continues to do this until the array is sorted.
The Bubble Sort algorithm is inefficient for large arrays, but it is still a useful algorithm to learn because it is easy to understand and implement.

### Tree Traversal - Day 6

Tree traversal is an algorithm that visits all the nodes of a tree in a specific order. There are three main types of tree traversal algorithms: inorder, preorder, and postorder.
Inorder traversal visits the left subtree of a node, then the node itself, and then the right subtree. Preorder traversal visits the node itself, then the left subtree, and then the right subtree. Postorder traversal visits the right subtree of a node, then the left subtree, and then the node itself.

### Multiples of 3 and 5 - Day 7

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



### Reverse Addition - Day 15


### Coin Sum Generator - Day 16


### Password Generator - Day 17


### Ascii Value - Day 18


### Pyramid Generator - Day 19


### Matrix Keypad - Day 20


### Binary To Decimal Conversion - Day 21


### Character Frequency - Day 22


### Matrix - Day 23


### Student Marking System - Day 24


### Binary Search Tree - Day 25


### Binary Overloading - Day 26
