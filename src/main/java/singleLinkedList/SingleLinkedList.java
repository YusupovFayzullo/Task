package singleLinkedList;


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

		System.out.println(sl);
	}
}
