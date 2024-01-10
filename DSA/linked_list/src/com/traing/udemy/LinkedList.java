package com.traing.udemy;

//import javax.xml.soap.Node;

public class LinkedList {
	private Node head;

	private Node tail;

	private int length;

	class Node {
		int values;
		Node next;
		Node(int values) {
			this.values = values;
		}
	}

	public LinkedList(int values) {
		Node newNode = new Node(values);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.values);
			temp = temp.next;
		}
	}

	public void append(int values) {
		Node newNode = new Node(values);
		if (length == 0 ) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) return null;
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		if (length == 0) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for (int i = 0 ; i < index ; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index , int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.values = value;
			return true;
		}
		return false;
	}

	public void getHead() {
		System.out.println("Head: " + head.values);
	}

	public void getTail() {
		System.out.println("Tail: " + tail.values);
	}

	public void getLength() {
		System.out.println("length: " + length);
	}

}
