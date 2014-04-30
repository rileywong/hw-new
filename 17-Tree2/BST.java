public class BST{
    private Node root;
    
    public BST(){
	root = null;
    }

    public Node getRoot() {
	return root;
	/*if (root.getLeft() != null) 
	    return root.getLeft();
	    else return root.getRight();*/
    }
  
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
	return p.getData();     
    }
  
    public void insert(Node n){
	Node p = root;
	while(p != null && p.getData() != n.getData()){
	    if(p.getData() > n.getData()){
		p = p.getLeft();
	    }
	    else {
		p = p.getRight();
	    }
	}
	p = n;
    }
  
    public Node search2(Node c, int x){
	Node p = root;
	while(p != null && p.getData() != x){
	    if(p.getData() > x){
		search2(p.getLeft(), x);
	    }
	    else {
		search2(p.getRight(), x);
	    }
	}
	return p;
    }

    public void print(Node n){
	if(n == null)
	    return;
	else{
	    //Preorder Traversal
	    System.out.print(n.getData());
	    print(n.getLeft());
	    print(n.getRight());
	    /*In order Traversal
	      print getLeft
	      SOP data
	      print getRight
	    */
	    /*Post order traversal
	      print get left
	      print getright
	      SOP data
	    */
	}	   
    }
       
  
    public Node delete(int x)
  
}
