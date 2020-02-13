/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no6.nodeinsert;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Katwalusha
 */
public class No6NodeInsert {

      static class Node { 
        int key; 
        Node left, right; 
          
      
        Node(int key){ 
            this.key = key; 
            left = null; 
            right = null; 
        } 
    } 
      
       static Node root; 
    static Node temp = root; 
      
   
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); 
        System.out.print(temp.key+" "); 
        inorder(temp.right); 
    } 
       
    static void insert(Node temp, int key) 
    { 
        Queue<Node> n = new LinkedList<>(); 
        n.add(temp); 
         
        while (!n.isEmpty()) { 
            temp = n.peek(); 
            n.remove(); 
       
            if (temp.left == null) { 
                temp.left = new Node(key); 
                break; 
            } else
                n.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(key); 
                break; 
            } else
                n.add(temp.right); 
        } 
    } 
       
    
    
    public static void main(String[] args) {
        
        root = new Node(1); 
        root.left = new Node(2); 
        root.left.left = new Node(3); 
        root.right = new Node(4); 
        root.right.left = new Node(5); 
        root.right.right = new Node(6); 
       
        System.out.print( "Before insertion:"); 
        inorder(root); 
       
        int key = 7; 
        insert(root, key); 
       
        System.out.print("\nAfter insertion:"); 
        inorder(root); 
    }
    
}
