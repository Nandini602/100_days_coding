
import java.util.*;

public class Avl{

    static class Node{
        int  data, height;
        Node left ,right;

        Node(int data){
            this.data = data;
            height =1;
        }
    } 

    public static Node root; 

    public static int height(Node root){
        if(root == null)
         return 0; 

         return root.height; 
    } 

    static int max(int a ,int b){
        return (a>b) ? a:b;
    } 

    

    // get balance factor of node 
        public static int getbalance(Node root){
            if(root == null) 
              return 0; 

            return height(root.left) - height(root.right);
        }

    public static Node insert(Node root , int key){
        if(root == null){
            return new Node(key);
        } 

        if(key < root.data) 
            root.left = insert(root.left , key);
        else if (key> root.data){
            root.right = insert(root.right,key);
        }
        else 
           return root;  // duplicate key not allowed

        //update root height 
        root.height = 1+ Math.max(height(root.left),height(root.right)); 
        
        // get root balance factor 
        int bf = getbalance(root);

        //left left  case 
        if(bf > 1 && key < root.left.data) 
           return rightRoate(root);

        //right right case 
        if(bf < -1 && key < root.right.data) 
           return leftRoate(root); 

         //left right case 
        if(bf > 1 && key > root.left.data) {
          root.left  = leftRoate(root.left); 
          return rightRoate(root);
        }
         //right left case 
        if(bf < -1 && key > root.right.data){
           root.right =  rightRoate(root.right);
           return leftRoate(root);
        } 

        return root; // returned  if balance avl

    }  
    // left rotate 
    public static Node leftRoate(Node x){
        Node y = x.right;
        Node t2 =  y.left;

        //perform rotation 
        y.left = x ; 
        x.right = t2; 
        
        //update heights 
        x.height = Math.max(height(x.left), height(x.right)) + 1; 
        y.height = Math.max(height(y.left), height(y.right)) + 1; 
 

        //return new root 
        return y ;
    }

     // right rotate 
    public static Node rightRoate(Node y){
        Node x = y.left;
        Node t2 =  y.right;

        //perform rotation 
         x.right =y ; 
        y.left = t2; 
    
        
        //update heights 
         y.height = Math.max(height(y.left), height(y.right)) + 1; 
         x.height = Math.max(height(x.left), height(x.right)) + 1; 
         
 

        //return new root 
        return x ;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        } 
      
      System.out.print(root.data + " "); 
      preorder(root.left);
      preorder(root.right);

    }   
    public static void main(String args[]){
           root = insert(root,10);
           root = insert(root,20);
           root = insert(root,30);
           root = insert(root,40);
           root = insert(root,50);
           root = insert(root,25); 

           /*  avl 

                30
               /  \
              20   40 
             /  \    \ 
            10   25   50 

        */ 

    preorder(root);

    }
}