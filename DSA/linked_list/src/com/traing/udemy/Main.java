package com.traing.udemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList myLinkList = new LinkedList(0);
        myLinkList.append(1);
        myLinkList.append(2);
        myLinkList.append(3);
        myLinkList.append(4);

        myLinkList.printList();

        myLinkList.set(2,8);

	    System.out.println("----");

	    myLinkList.printList();

    }
}
