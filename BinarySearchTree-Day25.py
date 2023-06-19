from re import search
class TreeNode():
    def __init__(self, item):
        self.item = item
        self.left = None
        self.right = None


class binarySearchTree():
    def __init__(self):
        self.root = None

    #insert function
    def insert(self, item):
        if self.root is None:
            self.root = TreeNode(item)
        else:
            self._insert(item, self.root)

    def _insert(self, item, currentNode):
        if item < currentNode.item:
            if currentNode.left is None:
                currentNode.left = TreeNode(item)
            else:
                self._insert(item, currentNode.left)
        elif item > currentNode.item:
            if currentNode.right is None:
                currentNode.right = TreeNode(item)
            else:
                self._insert(item, currentNode.right)
        else:
            print("Item is already existed in the tree")

    #  Task 2: Implement the search operation
    # tree.root.left accesses the whole left subtree
    def search(target, Tree):
        if Tree is None:
            return False
        elif Tree.root.item == target:
            return True
        elif Tree.root.item > target:
            return search(target, Tree.root.left)
        else:
            return search(target, Tree.root.right)

    #  Task 3: Implement the find_minimum operation
    def find_minimum(self):
        if self.root is None:
            return None
        else:
            return self._find_minimum_aux(self.root)

    def _find_minimum_aux(self, current):
        if current.left is None:
            return current.item
        else:
            return self._find_minimum_aux(current.left)

    #  Task 4: Implement the treeRange operation
    def treeRange(self, a, b):
        if self.root is None:
            return None
        else:
            return self._treeRange_aux(self.root, a, b)

    def _treeRange_aux(self, current, a, b):
        if current is not None:
            if current.item >= a and current.item <= b:
                print(current.item, end=" ")
            if current.item > a:
                self._treeRange_aux(current.left, a, b)
            if current.item < b:
                self._treeRange_aux(current.right, a, b)


    # Traversal algorithm, will be discussed next week.

    def print_preorder(self):
        self._print_preorder_aux(self.root)

    def _print_preorder_aux(self, current):
        if current is not None:
            print(current.item)
            self._print_preorder_aux(current.left)
            self._print_preorder_aux(current.right)


bst = binarySearchTree()
bst.insert(24)
bst.insert(4)
bst.insert(1)
bst.insert(25)
bst.insert(13)
bst.insert(6)
bst.insert(45)
bst.insert(16)
bst.insert(67)
bst.print_preorder()
print("The minimum item is : " ,bst.find_minimum())
print("tree range : ")
bst.treeRange(6,67)
