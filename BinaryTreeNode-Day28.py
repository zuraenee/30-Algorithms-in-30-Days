sclass TreeNodes:
    def __init__(self, item=None):
        self.item = item
        self.left = None
        self.right = None

    def is_leaf(self):
        return self.left is None and self.right is None
class BinaryTree:
    def __init__(self, root):
        self.root = root

    def dominates(self):
        return self.dominates_aux(self.root)

    def dominates_aux(self, node):
        if node is None:
            return False
        elif node.left != None and node.item < node.left.item:
            return False
        elif node.right != None and node.item < node.right.item:
            return False
        else:
            return self.dominates_aux(node.left) and self.dominates_aux(node.right)

Tree = TreeNode(5)
BinaryCoolTree = BinaryTree(Tree)
Tree.left = TreeNode(4)
Tree.right = TreeNode(6)
Tree.left.left = TreeNode(4)
Tree.left.right = TreeNode(2)
Tree.right.left = TreeNode(1)
Tree.right.right = TreeNode(3)
print(BinaryCoolTree.dominates())
