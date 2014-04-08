public class MyStackArray {
   
    private String[] a;
    private int index;

    // constructor
    public MyStackArray(){
	a = new String[10];
	index = -1;
    }
    
    // push
    public void push(String s){
	String[] tmp = new String[a.length * 2];
	if (index + 1 == a.length){
	    for(int x = 0; x < a.length; x ++){
		tmp[x] = a[x];
	    }
	}
	index ++;
	tmp[index] = s;
	a = tmp;
    }

    
    // pop
    public String pop(){
	String tmp = a[index];
	index --;
	return tmp;	
    }
   
    // peek
    public String peek(){
	return a[index];
    }

    // isEmpty

    public boolean isEmpty(){
	return index == -1;
    }

    // toString

    public String toString(){
	String tmp = "";
	for ( int x = index; x == -1; x--){
	    tmp = tmp + ", " + a[index];
	}
	return tmp;
    }

    public int getSize(){
	return index;
    }

}