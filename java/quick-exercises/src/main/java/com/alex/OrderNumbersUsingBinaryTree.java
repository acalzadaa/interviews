package com.alex;


public class OrderNumbersUsingBinaryTree
{

    /*
    For a given list of integer numbers i.e 8,3,2,9,4,5
    a) write a method to create a BINARY TREE STRUCTURE with these numbers
    b) then... write a method to PRINT ON THE CONSOLE all the values from binary tree structure
    ORDERED from the lowest to the highest

    input: 8,3,2,9,4,5
    output: 2,3,4,5,8,9

     */

    public static void main(String[] args)
    {
        final var root = addRecursive(null, 8);
        addRecursive(root, 3);
        addRecursive(root, 2);
        addRecursive(root, 9);
        addRecursive(root, 4);
        addRecursive(root, 5);

        printAllNodesInOrder(root);
    }

    static Node addRecursive(Node current, int value)
    {
        if (current == null)
        {
            return new Node(value);
        }

        if (value < current.data)
        {
            current.left = addRecursive(current.left, value);
        }
        else if (value > current.data)
        {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    static void printAllNodesInOrder(Node root)
    {
        if (root == null)
            return;

        //first traverse to the left subtree
        printAllNodesInOrder(root.left);

        //then print the data of node
        System.out.print(root.data + " ");

        //then traverse to the right subtree
        printAllNodesInOrder(root.right);
    }

    static class Node
    {
        int data;
        Node left = null;
        Node right = null;

        Node(int data)
        {
            this.data = data;
        }
    }
}
