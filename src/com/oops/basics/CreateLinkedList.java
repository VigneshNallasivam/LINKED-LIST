package com.oops.basics;

public class CreateLinkedList 
{
	Node head;

	class Node
	{
		Object data;
		Node ref;
		Node(Object data)
		{
			this.data = data;
		}
	}
	/*
	 * Function to create a Linked List
	 */
	public void elements(Object data)
	{
		Node newNode = new Node(data);
		System.out.print(newNode.data+"->");
	}

	public static void main(String[] args) 
	{
		CreateLinkedList obj = new CreateLinkedList();
		obj.elements(10);
		obj.elements(20);
		obj.elements(30);
		obj.elements(40);
		obj.elements(50);
	}

}
