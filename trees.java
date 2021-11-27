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

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40); 
        System.out.print("Inorder traversal of tree is : ");
        inorder(root);
    } 
}
