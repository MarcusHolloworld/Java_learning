package com.traing.udemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList myLinkList = new LinkedList(0);
        myLinkList.append(1);
        myLinkList.append(2);
        myLinkList.append(3);
        myLinkList.append(4);

	    System.out.println(myLinkList.get(2).values + "\n");

        myLinkList.printList();
    }
}
