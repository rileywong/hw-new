public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = null;
    }

    public void add(String s){
	Node temp = new Node(s);
	//	head = temp;
	temp.setNext(head);
	head = temp;
    }

    public String toString(){
	String s;
	s = "" + head.getData() + " " + head.getNext();
	return s;
    }

    public void add(int i, String s){
	Node temp1 = new Node(head.getData());
      
	while(i != 1){
	    i--;
	    temp1 = head.getNext();
	}
	
	    Node temp = new Node(s);
	    temp.setNext(temp1.getNext());
	    temp1.setNext(temp);
	
	    
    }

    public String get(int i){
	Node temp1 = new Node(head.getData());
	while(i != 0){
		temp1 = temp1.getNext();
	    	i--;
	}
	
	return temp1;
    }

    public String set(int i, String s){
	Node fin = head;
	Node temp1 = new Node(fin.getData());
	Node temp2 = new Node(fin.getNext());
	while(i!= 0){
		temp1 = temp1.getNext();
		temp2 = temp2.getNext();
		i--;
	}
	temp1 = setNext(temp2);
	temp2 = setNext(temp2.getNext());
	return fin;
    }

    public int find(String s){
	Node fin = head;
	int fin1 = -1;
	for(int x = 0; x < this.length() ; x ++){
		if(fin.data() == s){
			fin1 = x;
			return fin1;
		}
		temp = temp.getNext();
	}
	return fin1;
    }

    public int length(){
	Node fin = head;
	int fin1 = 0;
	while(fin.getData() != null){
		fin1++;
		fin = fin.getNext();
	}
	return fin1;
    }

    public String remove(int i){
	return "s";
    }

  


    public static void main(String[]args){
	MyLinkedList x = new MyLinkedList();
	x.add("a");
	System.out.println(x);
	x.add("b");
	System.out.println(x);
	x.add(0,"c");
	System.out.println(x);
	x.add(0,"v");
	System.out.println(x);
	x.add("d");
	System.out.println(x);
	x.add("e");
	System.out.println(x);
	x.add("f");
	System.out.println(x);
	x.add(2,"x");
	System.out.println(x);
	x.add("z");
	System.out.println(x);

    }


}
