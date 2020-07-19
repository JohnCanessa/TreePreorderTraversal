// **** imports ****
import java.util.*;

/**
 * 
 */
class Node {
    Node left;
    Node right;
    int data;
    
    // **** constructor ****
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

/**
 * 
 */
class Solution {

    /**
     * Function we need to develop.
     * This is a recursive function.
     */
    public static void preOrder(Node root) {

        // **** check if we are done ****
        if (root == null)
            return;

        // **** display the data in this node ****
        System.out.print(root.data + " ");

        // **** traverse the left child ****
        preOrder(root.left);

        // **** traverse the right child ****
        preOrder(root.right);
    }

    /**
     * Optional function to perform in-order tree traversal.
     * This is a recursive function.
     */
    public static void inOrder(Node root) {

        // **** check if we are done ****
        if (root == null)
            return;

        // *** visit the left child ****
        inOrder(root.left);

        // **** display the data in this node ****
        System.out.print(root.data + " ");

        // **** visit the right child ****
        inOrder(root.right);
    }

    /**
     * Optional function to perform post-order tree traversal.
     * This is a recursive function.
     */
    public static void postOrder(Node root) {

        // **** check if we are done ****
        if (root == null)
            return;

        // **** visit the left child ****
        postOrder(root.left);

        // **** visit the right child ****
        postOrder(root.right);

        // **** display the data in this node ****
        System.out.print(root.data + " ");
    }

    /**
     * Function provided by HackerRank.
     * This is a recursive function.
     */
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    /**
     * Test scaffolding.
     */
    public static void main(String[] args) {

        // **** open a scanner ****
        Scanner scan = new Scanner(System.in);

        // **** read the number of nodes ****
        int t = scan.nextInt();

        // ???? ????
        System.err.println("main <<< t: " + t);

        // *** define the root of the binary tree ****
        Node root = null;

        // **** loop inserting nodes into the binary tree ****
        while (t-- > 0) {

            // **** get the data for the next node in the binary tree ****
            int data = scan.nextInt();

            // ???? ????
            System.err.println("main <<< data: " + data);

            // **** insert the node into the binary tree ****
            root = insert(root, data);
        }

        // **** close the scanner ****
        scan.close();

        // **** pre-order traversal ****
        preOrder(root);
        System.out.println();

        // **** in-order traversal (optional) ****
        inOrder(root);
        System.out.println();

        // **** post-order traversal (optional) ****
        postOrder(root);
        System.out.println();
    }	
}