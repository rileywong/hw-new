public class DoubleLL<E> {
   
    private Node<E> head,tail;
    private class Node<E>{
	E data;
	Node<E> next,prev;
	public Node(E d){
	    this.data = d;
	}
	public String toString(){
	    return "" +data;
	}

	public void setData(E d){data= d;}
	public E getData(){return data;}

	public void setNext(Node<E> n) { next = n;}
	public Node<E> getNext() { return next;}

	public void setPrev (Node<E> p) {prev = p;}
	public Node<E> getPrev() { return prev;}

    }

    private Node<E> current;
    
    public void insert(E d) {
	Node<E> n = new Node<E> (d);
	if(current == null){
	    head = n;
	    tail = n;
	    head.setNext(tail);
	    head.setPrev(tail);
	    current = n;
	    tail.setNext(head);
	    tail.setPrev(head);
	}
	else if(current == head){
	    n.next = current;
	    current.prev = n;
	    current = n;
	    head = n;
	    tail.setNext(head);
	    head.setPrev(tail);
	}
	else{
	    n.next = current;
	    n.prev = current.getPrev();
	    current.getPrev().next = n;
	    current.prev = n;
	    current = n;
	}
    }
    
    public E getCurrent() {
	return current.getData();
    }

    public void forward() {
	    current = current.getNext();
    }
    
    public void back() {
	    current = current.getPrev();
    }
    
    public String Delete(){
	Node<E> temp = current; 
	if(current == null){
	    return "List was empty";
	}
	else if(current == head){
	    tail.next = head.next;
	    head.getNext().setPrev(tail);
	    head = head.getNext();
	    current = head;
	    return "Deleted: " + temp;
	}
	else if (current == tail){
	    tail.getPrev().setNext(head);
	    head.prev = tail.prev;
	    tail = tail.getPrev();
	    current = tail;
	}
	
    }

    public String toString() {
	if(current == null)
	    return "";
	while (current.getPrev() != tail)
	    current = current.getPrev();

	Node<E> tmp = current;
	String s = "";
	while(tmp != head){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
 
 
    public static void main (String [] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//First test up to here
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	//then test again to here
    }
}
