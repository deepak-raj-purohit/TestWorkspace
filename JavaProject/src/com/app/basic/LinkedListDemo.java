package com.app.basic;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.insert("1");
		l.insert("2");
		l.insert("3");
		l.insert("4");
		l.insert("5");
		l.traverse();
		l.reverse();
		l.traverse();
	}
	
	
}

class LinkedList {
	
	Node start;
	Node end;
	int size = 0;
	
	public LinkedList() {
		
	}
	
	public void insert(String value) {
		Node node = new Node(value,null);
		if(start==null) {
			start = node;
			end = node;
		} else {
			end.next = node;
			end = node;
		}
		size++;
		
	}
	
	public int size() {
		return size;
	}
	public void traverse() {
		Node nextNode = start;
		while(nextNode!=null) {
			System.out.println(nextNode.value+" ");
			nextNode=nextNode.next;
		}		
	}
	
	public void delete() {
		
	}
	
	
	public void reverse() {
		
		Node previousNode = null;
		Node currentNode = start;
		Node nextNode = start;
		while(nextNode!=null) {
			nextNode=nextNode.next; //make nextNode point to next node.
            currentNode.next=previousNode; //make current node's next point to previous node.
            previousNode=currentNode;  //make previousNode point to currentNode.
            currentNode=nextNode;   //make currentNode point to nextNode.
		}
		start=previousNode;
		end = currentNode;
		System.out.println("LinkedList has been reversed successfully.");
	}
	
}

class Node {
	String value;
	Node next;
	
	public Node(String value, Node next){
		this.value = value;
		this.next = next;
	}
}
