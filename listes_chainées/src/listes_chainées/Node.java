package listes_chainées;

public class Node {
	private int element;
	private Node next;
	
	//create
	public Node(int s,Node n) {  
		element = s;
		next = n;
	}
	//read
	public int getElement() {return element;}  
	
	//read
	public Node getNext() {return next;}
	
	//update
	public void updateElement(int el) {
		this.element=el;
		}
	
	//update
	public void updateNext(Node n) {
		this.next=n;
		}
	
	//delete
	
}
