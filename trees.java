class Node{
    int data; 
    Node left; 
    Node right; 
    Node(int k){
      data=k;
      left=right=null;
    }
}

public class trees {
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    static int height(Node root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    } 
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40); 
        System.out.print("Inorder traversal of tree is: ");
        inorder(root);
        System.out.println();
        System.out.print("Preorder traversal of tree is: ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder traversal of tree is: ");
        postorder(root);
        System.out.println();
        System.out.print("Height of binary tree is: "+height(root));
    } 
}
