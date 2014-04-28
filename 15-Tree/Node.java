public class Node{
    private String data;
    private Node left, right;
    
    public Node(String s){
	data = s;
	left = null
	right = null;
    }
    
    public void setData()(String s){
	data = s;
    }
   
    public String getData(){
      	return data;
    }
    
    public void setLeft(Node n){
	left = n;
    }

    public void setRight(Node n){
	right = n;
    }

    public Node getRight(){
	return right;
    }
    
    public Node getLeft(){
	return left;
    }

    public String toString(){
	return "" + data;
    }

  
}
