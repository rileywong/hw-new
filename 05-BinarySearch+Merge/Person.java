  import java.io.*;
  import java.util.*;
  
  public class Person implements Comparable{
      public String name;
      public int age;
  
      public Person(String a, int b){
  	name = a;
  	age = b;
      }
    
    public int getAge(){
      return age;
      }
      
    public int getName(){
      return name;
      }
      
      
      public int compare(Object a){
  	if (age > ((Person)a).age){
  	    return 1;
  	}
  	if (age < ((Person)a).age){
  	    return -1;
  	}
  	return 0;
      }
  
     
  }
