package datastructures.tree;

public class BinarySearchTree extends BinaryTree<Integer> {
    protected Node root;

    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int data ){
        root = new Node(data);
    }

    public void add(int value){
        addNode(root, value);
    }
    public void addNode(Node root, int value){
        Node current = root;
        Node parent = null;
        if (root == null){
            Node newNode = new Node(value);
            root = newNode;
        }
        while (current != null){
            parent = current;
            if (value < (int)current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (value < (int)parent.data){
            parent.left = new Node(value);
        } else {
            parent.right = new Node(value);
        }
    }
    public boolean contains(Node root, int value){
        if (root == null){
            return false;
        } else {
            if ((int)root.data == value){
                return true;
            } else if ((int)root.data > value){
                return contains(root.left, value);
            } else {
                return contains(root.right, value);
            }
        }

    }
    public Node createMinimalBST(int[] array){
        return createMinimalBST(array, 0, array.length - 1);
    }
    public Node createMinimalBST(int[] arr, int start, int end){
        if (end < start){
            return null;
        }
        int mid = (start + end) / 2;
        Node n = new Node(arr[mid]);
        n.left = createMinimalBST(arr, start, mid - 1);
        n.left = createMinimalBST(arr, mid  + 1, end);
        return n;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        BinarySearchTree b = new BinarySearchTree();
        Node n = b.createMinimalBST(arr);
        b.inOrder(b.getRoot());
    }
}
