
public class Queue{
    private Node head,tail;
    private int len;

    public Queue() {
	head = null;
	tail = null;
	len = 0;
    }

    public void enqueue(String s){
	Node n = new Node(s);
	if (len == 0){
	    head = n;
	    tail = n;
	}
	else {
	    tail.setNext(n);
	    tail = n;
	}
	len ++;
    }

    public String dequeue(){
	String s;
	if(head = null){
	    return null;
	}
	s = head.getData();
	head = head.getNext();
	len --;
	if(head == null){
		tail = null;
	}
	return s;
    }

    public String toString(){
	String s = "Head ---> ";
	Node tmp = head;
	while(tmp != null){
	    s = s + tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	s = s + " tail";
	return s;
    }

}
