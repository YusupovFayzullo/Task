package singleLinkedList;


import java.util.Objects;
import java.util.StringJoiner;

public class SingleLinkedList<E> {

	Node<E> head;

	int size;

	public boolean add(E item){
		var  newNode = new Node<>(item);

		if(head==null){

          head=newNode;
		  size++;
		  return true;
		}

		var x=head;
		while (x.next!=null){
			x=x.next;

		}

		x.next=newNode;
		size++;
		return true;

	}

	public  E remove(int index){


		if(index==0) {
			E oldvalue = head.item;
			head = head.next;
			size--;
			return oldvalue;
		}
		var x = getNode(index);
		var prev=getNode(index-1);
		prev.next=x.next;
		size--;
		  return x.item;
		}
	public  E get(int index){

		Objects.checkIndex(index,size);
		var x = getNode(index);

		return x.item;
	}

	private Node<E> getNode(int index){
		var x=head;

		for(int i=1; i<=index; i++){
			x=x.next;
		}
		return x;
	}

	class Node<E> {

		E item;
		Node<E> next;

		public Node(E item) {
			this.item = item;
			this.next=null;
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

class SingleLinkedListTest {

	public static void main(String[] args) {

		var sl=new SingleLinkedList<String>();

		sl.add("Java");
		sl.add("Python");
		sl.add("C#");


	//	System.out.println("sl.remove(0) = " + sl.remove(0));
		System.out.println("sl.remove(1) = " + sl.remove(1));
		System.out.println("sl = " + sl);

		// System.out.println(sl);
	}
}
