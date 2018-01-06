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
public class Node {

    //variables

    String value;
    Node leftNode;
    Node rightNode;

    //constructor

    public Node(String v) {
        value = v;
        leftNode = rightNode = null;
    }

    //insert a new value

    public void insert(String v) {
        //compare to value
        if (v.compareTo(value) <= 0) {
            //belongs on the left
            if (leftNode == null) {
                //create a new left child
                leftNode = new Node(v);
            } else {
                //delegate to left child
                leftNode.insert(v);
            }
        } else {
            //belongs on the right
            if (rightNode == null) {
                //create a new right child
                rightNode = new Node(v);
            } else {
                //delegate to right child
                rightNode.insert(v);

            }
        }
    }

    // check if a value is contained in the tree

    public boolean contains(String v) {
        // check if I have the value 
        if (v == value) {
            System.out.println(v + " is contained in the tree.");
            return true;
        } else if (v.compareTo(value) <= 0) {
            //must be on the left
            if (leftNode == null && !v.equals(value)) {
                System.out.println(v + " is not in the tree.");
                return false;
            } else {
                if (v.equals(value)) {
                    System.out.println(v + " is contained in the tree.");
                    return true;
                }
                return leftNode.contains(v);
            }
        } else {
            //must be on the right
            if (rightNode == null && !v.equals(value)) {
                System.out.println(v + " is not in the tree.");
                return false;
            } else {
                if (v.equals(value)) {
                    System.out.println(v + " is contained in the tree.");
                    return true;
                }
                return rightNode.contains(v);
            }
        }
    }

    //Traversals

    public void printlnOrder() {
        //go left
        if (leftNode != null) {
            leftNode.printlnOrder();
        }
        //visit
        System.out.print("[" + value + "]");
        //go right
        if (rightNode != null) {
            rightNode.printlnOrder();
        }
    }

    public void printPreOrder() {
        //visit
        System.out.print("[" + value + "]");
        //go left
        if (leftNode != null) {
            leftNode.printPreOrder();
        }
        //go right
        if (rightNode != null) {
            rightNode.printPreOrder();
        }
    }

    public void printPostOrder() {
        //go left
        if (leftNode != null) {
            leftNode.printPostOrder();
        }
        //go right 
        if (rightNode != null) {
            rightNode.printPostOrder();
        }
        //visit
        System.out.print("[" + value + "]");

    }
}
