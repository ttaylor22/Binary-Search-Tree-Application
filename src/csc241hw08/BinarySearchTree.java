/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw08;

/**
 *
 * @author Tevin
 */
public class BinarySearchTree {

    //Root of the tree

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    //insert a new value

    public void insert(String v) {
        //check for an empty tree
        if (root == null) {
            //create first node
            root = new Node(v);
        } else {
            root.insert(v);
        }
    }

    //if value is contained in the tree

    public boolean contains(String v) {
        //check for an empty tree
        if (root == null) {
            //empty
            return false;
        } else {
            return root.contains(v);
        }
    }
    // in-order traversal
    public void printInOrder(){
        // check if root is null
        if(root==null){
            // empty
            System.out.println("The tree has no nodes.");
        } else {
            System.out.println("In-order:");
            root.printlnOrder();
            System.out.println();
        }
    }
    // pre-order traversal
    public void printPreOrder(){
        // check if root is null
        if(root==null){
            //empty
            System.out.println("The tree has no nodes.");
        } else {
            System.out.println("Pre-order:");
            root.printPreOrder();
            System.out.println();
        }
    }
    //post-order traversal
    public void printPostOrder(){
        // check if root is null
        if(root==null){
            //empty
            System.out.println("The tree has no nodes.");
        } else {
            System.out.println("Post-order:");
            root.printPostOrder();
            System.out.println();
        }
    }
}
