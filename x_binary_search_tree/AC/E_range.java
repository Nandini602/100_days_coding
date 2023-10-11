

import java.util.*;


public class E_range{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    } 

    public static Node insert(Node root, int val){
        if(root == null){
            root = new  Node(val);
            return root;
        } 
        if(root.data>val){
            //left subtree 
           root.left = insert(root.left , val);
        } 
        else{ //right
            root.right = insert(root.right,val);
        } 

        return root;
    } 


    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }  

    public static boolean search(Node root ,int key){
    if(root == null){
        return false;
    }

    if(root.data == key){
        return true;
    }

    if(root.data > key){
        return search(root.left,key);
    }
    else{
        return search(root.right , key);
    } 

    } 

    public static void printinrange(Node root , int k1, int k2){ 
        if(root == null ){
            return ;
        }
        if(root.data >=k1 && root.data <=k2){
            printinrange(root.left , k1 ,k2);
            System.out.print(root.data + " ");
            printinrange(root.right , k1,k2);
        }
        else if(root.data<k1){
            printinrange(root.left , k1,k2);

        }
        else{
            printinrange(root.right, k1,k2);
        }
    }


        
    public static void main(String args[]){
            int values[] = {5,1,3,4,2,7}; 
            Node root = null;

            for(int i=0;i<values.length;i++){
                root = insert(root,values[i]);
            } 

            inorder(root); 
            System.out.println();
            printinrange(root ,5 ,12);

            
          

    }
}