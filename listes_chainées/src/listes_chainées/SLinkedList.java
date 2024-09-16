package listes_chainées;

public class SLinkedList {
	private Node head;
	private long size;
	
	public SLinkedList() {
		head = null;
		size = 0;
	}
	
	public void setHead(Node head) {
		if (this.head==null) {
			this.head=head;
		}
		else {
			head.updateNext(this.head);
			this.head = head;
		}
		this.size+=1;
	}
	
	public void setSize(int size) {
		this.size=size;
	}
	
	
	public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + " --> ");
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }
	
	public int getAvantDernier() {
		Node penultimate = head;
		Node ultimate = head.getNext();
		Node none = ultimate.getNext();
		
		while(none !=null) {
			penultimate=ultimate;
			ultimate=none;
			none=none.getNext();
		}
		return penultimate.getElement();
	}
	
	public void inverse() {
        Node precedent = null;
        Node current = head;
        Node suivant = null;

        while (current != null) {
            suivant = current.getNext();
            current.updateNext(precedent);
            precedent = current;
            current = suivant;
        }

        head = precedent;
    }
	
	public void swap(int x, int y) {
        if (head == null) return;
        Node node1 = head, node2 = head;
        
        while (node1 != null && node1.getElement() != x) {
            node1 = node1.getNext();
        }
        while (node2 != null && node2.getElement() != y) {
            node2 = node2.getNext();
        }

        // SI on trouve pas un des 2 on sort
        if (node1 == null || node2 == null) return;
        int temp = node1.getElement();
        node1.updateElement(node2.getElement());
        node2.updateElement(temp);
    }


}
