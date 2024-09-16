package listes_chainées;

public class main {

	public static void main(String[] args) {
		Node test= new Node(1,null);
		Node test2 = new Node(2,null);
		Node test3 = new Node(4,null);
		
		SLinkedList list = new SLinkedList();
		list.setSize(3);
		list.setHead(test);
		test.updateNext(test2);
		list.setHead(test3);
		list.print();
		System.out.println("Avant dernier element : "+list.getAvantDernier());
		
		list.inverse();
		System.out.println("Liste inversé : ");
		list.print();
		
		Node test4= new Node(8,test3);
		Node test5 = new Node(6,test4);
		test.updateNext(test4);
		test.updateNext(test5);
		System.out.println("Ajout valeurs : ");
		list.print();
		
		list.swap(1,8);
		list.print();
		
		System.out.println("1.2 Liste doublement chainées : ");
		
		DLinkedList Dliste = new DLinkedList();
		DNode node1 = new DNode(1);
        DNode node2 = new DNode(4);
        DNode node3 = new DNode(3);
        DNode node4 = new DNode(8);
        DNode node5 = new DNode(2);
        DNode node6 = new DNode(9);
		
		Dliste.setHead(node1);
		Dliste.setHead(node2);
        Dliste.setHead(node3);
        Dliste.setHead(node4);
        Dliste.setHead(node5);
        Dliste.setHead(node6);
        
        Dliste.print();
        Dliste.swapNodes(1, 2);
        Dliste.print();
        
        DLinkedList Dlist = new DLinkedList();
        DNode Dnode1 = new DNode(2);
        DNode Dnode2 = new DNode(5);
        DNode Dnode3 = new DNode(9);
        DNode Dnode4 = new DNode(4);
        DNode Dnode5 = new DNode(1);
        
        Dnode1.next=Dnode2;
        Dnode2.next=Dnode3;
        Dnode3.next=Dnode4;
        Dnode4.next=Dnode5;
        Dnode5.next=Dnode1;
        
        Dlist.setHead(Dnode1);
        
        System.out.println("1.2 Nombre noeuds : ");
        System.out.println(Dlist.countCircularNodes());
        }

}
