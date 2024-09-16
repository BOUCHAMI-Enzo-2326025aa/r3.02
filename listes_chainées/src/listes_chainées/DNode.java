package listes_chainées;

public class DNode {
	int element;
    DNode next;
    DNode prev;

    public DNode(int element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public int getElement() {
        return element;
    }

    public DNode getNext() {
        return next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
