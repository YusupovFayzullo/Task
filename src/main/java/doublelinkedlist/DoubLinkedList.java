package doublelinkedlist;

import java.util.StringJoiner;

public class DoubLinkedList<E>{
	private Node<E> head;
	private Node<E> temp;

	private int size;

	public boolean add(E item){

		var newNode=new Node<>(item);

		if(temp==null){
			head=newNode;
		}
		else {
			temp.next=newNode;
			newNode.prev=temp;
		}
		temp=newNode;
		size++;
		return true;
	}
	class Node<E>{

		E item;

		Node<E> prev;

		Node<E> next;

		public Node(E item) {
			this.item = item;
		}

		public Node(E item, Node<E> prev, Node<E> next) {
			this.item = item;
			this.prev = prev;
			this.next = next;
		}
	}

	@Override
	public String toString() {

		StringJoiner sj = new StringJoiner(",", "[", "]");
		var x=head;
		while (x!=null){
			sj.add(String.valueOf(x.item));
			x=x.next;
		}
		return sj.toString();
	}
}

class DoublyLinkedListTest{
	public static void main(String[] args) {

		DoubLinkedList<Integer> dll = new DoubLinkedList<Integer>();
		dll.add(2);
		dll.add(2);
		dll.add(2);

		System.out.println(11<<2);
		System.out.println(11>>2);

		System.out.println("dll = " + dll);

	}
}