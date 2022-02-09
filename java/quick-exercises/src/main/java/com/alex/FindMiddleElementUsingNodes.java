package com.alex;


public class FindMiddleElementUsingNodes
{

    /*
    For a given list of integer numbers i.e 1,2,3,4,5,6
    write a method to find the number in the MIDDLE or ABOVE

    input: 1,2,3,4,5
    output: 3

    input: 1,2,3,4
    output: 3

     */

    static Node head = new Node(null,1);    //Head of list

    public static void main(String[] args)
    {
        push(head,2);
        push(head,3);
        push(head,4);
        push(head,5);
        push(head,6);
//        push(head,7);
//        push(head,8);

        Integer result = findTheMiddleNode(head);
        System.out.println(result);
    }

    private static Integer findTheMiddleNode(Node head)
    {
        var slowHead = head;
        var fastHead = head.next;

        while (fastHead != null && fastHead.next != null)
        {
            fastHead = fastHead.next.next;
            slowHead = slowHead.next;
        }
        return slowHead.data;
    }

    static void push(Node headRef, int data)
    {
        // Move the head to point to the new node
        head = new Node(headRef, data);
    }

    static class Node
    {
        int data;
        Node next;

        public Node(Node next, int data)
        {
            this.data = data;
            this.next = next;
        }
    }
}
