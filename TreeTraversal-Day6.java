import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the which type of tree-traversal you want to perform");
        System.out.println("1. Inorder Traversal");
        System.out.println("2. Preorder Traversal");
        System.out.println("3. Postorder Traversal");
        int choice = sc.nextInt();
        System.out.println("Enter the number of nodes in the tree");
        int numberOfNodes = sc.nextInt();
        int[] arr = new int[numberOfNodes];
        System.out.println("-----Enter the nodes of the tree-----");
        for (int i = 0; i<=numberOfNodes-1; i++) {
            System.out.print("Enter the Nodes at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("-----The nodes of the tree are-----");
        System.out.println(Arrays.toString(arr));
        BinaryTree tree = new BinaryTree(arr);
        switch (choice) {
            case 1:
                System.out.println("-----Inorder Traversal-----");
                tree.inorderTraversal();
                break;
            case 2:
                System.out.println("-----Preorder Traversal-----");
                tree.preorderTraversal();
                break;
            case 3:
                System.out.println("-----Postorder Traversal-----");
                tree.postorderTraversal();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public class BinaryTree{
        int[] arr;
        public BinaryTree(int[] arr) {
            this.arr = arr;
        }
        public void inorderTraversal() {
            inorderTraversal(0);
        }
        public void preorderTraversal() {
            preorderTraversal(0);
        }
        public void postorderTraversal() {
            postorderTraversal(0);
        }
        public void inorderTraversal(int index) {
            if (index >= arr.length) {
                return;
            }
            inorderTraversal(2*index+1);
            System.out.print(arr[index] + " ");
            inorderTraversal(2*index+2);
        }
        public void preorderTraversal(int index) {
            if (index >= arr.length) {
                return;
            }
            System.out.print(arr[index] + " ");
            preorderTraversal(2*index+1);
            preorderTraversal(2*index+2);
        }
        public void postorderTraversal(int index) {
            if (index >= arr.length) {
                return;
            }
            postorderTraversal(2*index+1);
            postorderTraversal(2*index+2);
            System.out.print(arr[index] + " ");
        }
    }
    
}
