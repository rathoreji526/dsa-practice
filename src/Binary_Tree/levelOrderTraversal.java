package Binary_Tree;
import java.util.*;


public class levelOrderTraversal {
    static void levelTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        q.add(root);
        q.add(null);
        ans.add(new ArrayList<Integer>());

        //run loop while queue is not empty
        while(!q.isEmpty()){
            //pop a node from queue and store it into curr node
            Node curr = q.poll();

            //check if curr is null and q is not empty that means we got nodes of one level add into arraylist and add null into queue and continue because if we will not continue this iteration it will try to get null.data this will provide an error and if queue is empty then simply break loop because we reached end

            if(curr==null){
                if(!q.isEmpty()){
                    ans.add(new ArrayList<Integer>());
                    q.add(null);
                    continue;
                }else break;
            }

            // add current data into last list stored in list of list
            ans.getLast().add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }

        //print list
        for(int i = 0 ; i < ans.size() ; i++){
            for(int j = 0 ; j < ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
    //build tree
    static int idx = -1;
    static Node buildBinaryTree(int[] preorder){
        idx++;
        if(preorder[idx]==-1)return null;
        Node root = new Node(preorder[idx]);
        root.left = buildBinaryTree(preorder);
        root.right = buildBinaryTree(preorder);

        return root;
    }
    //main function
    public static void main(String[] args){
        int[] preOrder = {1 , 2 , -1 , -1  , 3 , 4 , -1 , -1 , 5 , -1 , -1};
        Node root = buildBinaryTree(preOrder);
        levelTraversal(root);
    }
}
