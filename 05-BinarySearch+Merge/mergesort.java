import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class mergesort{
  
  public static ArrayList<Comparable> mergesort(ArrayList<Comparable> a, ArrayList<Comparable> b){
    int x=0;
    int y=0;
    
    ArrayList<Comparable> fin = new ArrayList<Comparable>(a.size() + b.size());
    
    
    
    for(int n = 0; n < fin.size(); n++){
      if(a.get(x).compareTo(b.get(y))>0){
        fin.add(b.get(y));
        y++;
      }
      else{
        fin.add(a.get(x));
        x++;
      }
    }
    
    
    return fin;
  }
  
  public static ArrayList<Comparable> sort(ArrayList<Comparable> data){
    if(data.size()<2){
      return data;
    } 
    else{
      ArrayList<Comparable> a = new int[data.size()/2];
      ArrayList<Comparable> b = new int[data.size() - a.size()];
      
      for(int x = 0; x < a.size(); x++){
        a.add(data.get(x));
      }
      for(int n = 0; n < b.size(); n++){
        b.add(data.get(n+a.length));
      }
      a = sort(a);
      b = sort(b);
      data = merge(a,b);     
    }
    return data;
  }
  
  public static void main(String[]args){
    
    ArrayList<Comparable> a = new ArrayList<Comparable>(10);
    a.add(new person("Rizzle",95));
    a.add(new person("Dizzle",96));
    a= new ArrayList<Comparable>(mergesort(a));
    System.out.println(a);
    
  }
}
