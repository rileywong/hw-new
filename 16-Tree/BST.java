public class BST{
    private Node root;
    
    public int search(int x){
	Node p = root;
	while(p != null && p.getData() != x){
	    if(p.getData() > x){
		p = p.getLeft();
	    }
	    else {
		p = p.getRight();
	    }
	}
	return p;	    
    }

    public void insert(Node n){
	Node temp = root;
	boolean p;
	while(temp != null){
	    if(temp.getData() > n.getData()){
		temp = temp.getLeft();
		p = true;
	    }
	    else {
		temp = temp.getRight();
		p = false;
	    }
	}

}