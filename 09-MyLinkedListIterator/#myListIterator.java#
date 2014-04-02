public class myListIterator<E> implements Iterator<E>{
    
    private Node currentNode;
    
    public myListIterator<E>(Node n){
	currentNode = n;
    }
    
    public boolean hasNext(){
	return !(currentNode.getNext() == null);
    }
    
    public E next(){
	Node temp = currentNode;
	currentNode = currentNode.getNext();
	return temp;
    }
    
    public void remove(){
    }
    
}