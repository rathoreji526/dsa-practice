package Binary_Tree;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class buildBinaryTree {

    //building binary tree form preorder
    static int index = -1;
    static Node buildTree(int[] preOrder){
        index++;
        if(preOrder[index]==-1)return null;
        Node root= new Node(preOrder[index]);
        root.left = buildTree(preOrder);
        root.right = buildTree(preOrder);
        return root;
    }

    //printing binary tree inorder
    static void printTreeInorder(Node root){
        if(root==null)return;
        //left => root => right
        printTreeInorder(root.left);
        System.out.print(root.data+" ");
        printTreeInorder(root.right);
    }
    public static void main(String[] args){
        int[] preOrder = {1 , 2 , -1 , -1  , 3 , 4 , -1 , -1 , 5 , -1 , -1};
        Node root = buildTree(preOrder);
        printTreeInorder(root);

    }
}
/*
   approach to create tree using preorder
    => traverse the whole given array of preorder
    => create node of current data
    => left and right node will be created recursively and after that return current node/root.
    => time complexity is O(n);
 */
