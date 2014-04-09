import java.util.Scanner;
public class RPN{
  public static void main(String[]args){
    MyStack tmp = new MyStack();
    Scanner sc = new Scanner(System.in);
    boolean lifesucks = true;
    //if(i.nextLine().equals("+")){
    while(lifesucks){
      String i = sc.nextLine();
      if(i.equals("+")){
        int tmp1 = Integer.parseInt(tmp.pop());
        int tmp2 = Integer.parseInt(tmp.pop());
        int tmp3 = tmp1 + tmp2;
        tmp.push(Integer.toString(tmp3));
        System.out.println(tmp);
      }
      else if(i.equals("-")){
        int tmp1 = Integer.parseInt(tmp.pop());
        int tmp2 = Integer.parseInt(tmp.pop());
        int tmp3 = tmp1 - tmp2;
        tmp.push(Integer.toString(tmp3));
        System.out.println(tmp);
      }
      else if(i.equals("*")){
        int tmp1 = Integer.parseInt(tmp.pop());
        int tmp2 = Integer.parseInt(tmp.pop());
        int tmp3 = tmp1 + tmp2;
        tmp.push(Integer.toString(tmp3));
        System.out.println(tmp);
      }
      else if(i.equals("/")){
        int tmp1 = Integer.parseInt(tmp.pop());
        int tmp2 = Integer.parseInt(tmp.pop());
        int tmp3 = tmp1 / tmp2;
        tmp.push(Integer.toString(tmp3));
        System.out.println(tmp);
      }
      else{
        int tmp1 = Integer.parseInt(i);
        tmp.push(Integer.toString(tmp1));
        System.out.println(tmp);
        
      }
    }
  }
  
}
