import java.util.ArrayList;
public class QuickSort{
  public ArrayList<Integer> qsort(ArrayList<Integer> L){
    int a = L.size();
    if(a < 2){
      return L;
    }
    Integer pivot = (int)(Math.random()*a);
    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> right = new ArrayList<Integer>();
    for(int n = 0; n < a; n++){
      if((n != pivot) && (L[n] > L[pivot])){
        right.add(L[n]);
      }
      if(n != pivot && L[n] < L[pivot]){
        left.add(L[n]);
      }
    }
    Integer[] R1 = qsort(left);
    Integer[] R2 = qsort(right);
    Integer[] fin = new ArrayList<Integer>();
    fin.add(R1);
    fin.add(L[pivot]);
    fin.add(R2);
    return fin;
  }
}
    
