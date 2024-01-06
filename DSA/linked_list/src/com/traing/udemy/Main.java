package com.traing.udemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();

	    System.out.println("----------");

	    myLinkedList.prepend(34);
	    myLinkedList.printList();
    }
}
