
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VijayPutta
 */
class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
class BinaryTree {
    Node root; 
    void inorder(){
        Stack stack = new Stack();
        if(root == null){
            return;
        }
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr!=null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = (Node) stack.pop();
            System.out.println(curr.data);
            curr = curr.right;
        }
        
    }
    void preorder(){
        Stack stack = new Stack();
        if(root == null){
            return;
        }
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr!=null){
                stack.add(curr);
                System.out.println(curr.data);
                curr = curr.left;
            }
            curr = (Node) stack.pop();
            curr = curr.right;
        }   
    }
    // Using two stacks
    void postorder(){
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Node curr = root;
        stack1.add(curr);
        while(!stack1.isEmpty()){
            Node temp = (Node) stack1.pop();
            if(temp.left!=null){
                stack1.add(temp.left);
            }
            if(temp.right!= null){
                stack1.add(temp.right);
            }
            stack2.add(temp);
        }
        while(!stack2.isEmpty()){
            curr = (Node) stack2.pop();
            System.out.println(curr.data);
        }
    }
    //using one stack
    void postorderonestack(){
        Stack stack = new Stack();
        
        while(root != null || !stack.isEmpty()){
            while(root!=null){
                if(root.right!=null){
                     stack.add(root.right);
                }
                stack.add(root);
                root = root.left;
            }
            Node temp = (Node) stack.pop();
            Node child = null;
            if(!stack.isEmpty()){
                child =(Node)stack.peek();
            }
                    
            if(temp.right==child){
                root = (Node) stack.pop();;
                stack.add(temp);
            }else{
                System.out.println(temp.data);
            }
        }
    }
    
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.inorder(); 
        tree.preorder();
        tree.postorder();
        tree.postorderonestack();
    }
}
