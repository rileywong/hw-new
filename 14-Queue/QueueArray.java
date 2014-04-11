//Method 2
public class QueueArray{

    private String[] a;
    private int head,tail;

    public QueueArray(){
	a = new String[10];
	head = 0;
	tail = 0;
    }
    
    public void enqueue(String s){
	String[] tmp = new String[a.length() * 2];
	if(tail == a.length() - 1){
	    for(int x = head; x < a.length(); x ++){
		tmp[x] = a[x];
	    }
	    a = tmp;
	    a.add(s);
	    tail ++;
	}
	else{
	    a.add(s);
	    tail ++;
	}
    }

    public String dequeue(){
	String tmp;
	tmp = a[head];
	head ++;
	return tmp;
    }

    
}