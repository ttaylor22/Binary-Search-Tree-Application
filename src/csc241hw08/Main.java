/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw08;

import java.util.Scanner;

/**
 *
 * @author Tevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String command;
        Scanner input = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Welcome to Binary Tree Sorter");
        look:
        while (true) {
            System.out.println("Enter a command (i, c, in, pre, post, or q):");
            command = input.nextLine();
            String space[] = command.split(" ");
            if (space[0].equals("i")) {
                bst.insert(space[1]);
            } else if (space[0].equals("c")) {
                bst.contains(space[1]);
            } else if (space[0].equals("in")) {
                bst.printInOrder();
            } else if (space[0].equals("pre")) {
                bst.printPreOrder();
            } else if (space[0].equals("post")) {
                bst.printPostOrder();
            } else if (space[0].equals("q")) {
                System.out.println("Closing Binary Tree Sorter");
                break;

            } else {
                System.out.println("Invalid command -- " + command);

            }
        }
    }

}
