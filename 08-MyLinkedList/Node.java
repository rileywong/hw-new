public class Node{
    private String data;
    private Node next;
    
    public Node(String s){
	data = s;
    }
    
    public void setName(String s){
	data = s;
    }
   
    public String getData(){
	return data;
    }
    
    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return "Data: " + getData() + " Next: " + getNext();
    }

    public static void main(String[] args){
	Node n1;
	n1 = new Node("Tommy");
	System.out.println(n1);
	Node n2 = new Node("Sammy");
	Node n3 = new Node("Clyde");
	n2.setNext(n3);
	System.out.println(n2);
	n1.setNext(n2);
	System.out.println(n1.getNext());
	System.out.println(n2.getNext());
    }

}
