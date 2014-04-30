public class Driver{
    public static void main(String[] args){
	BST a = new BST();
	a.insert(new Node(5));
	a.insert(new Node(10));
	a.insert(new Node(13));
	a.insert(new Node(17));
	a.print(a.getRoot());
	System.out.print(a.getRoot().getData());
    }

}