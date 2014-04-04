public class Driver{
    
    public static void main(String[]args){
	MyStack stack = new MyStack();
	stack.push("one");
	System.out.println(stack.pop());
	stack.push("two");
	stack.push("three");
	System.out.println(stack);
    }

}