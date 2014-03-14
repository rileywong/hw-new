public class mergesort{
  
  public static int[] merge(int[]a,int[]b){
    int x=0;
    int y=0;
    
    int[] fin = new int[a.length+b.length];
    /*
     while( x+y != fin.length){
     if(a[x] < b[y]){
     fin[x+y] = a[x];
     x++;
     }
     else {
     fin[x+y] = b[y];
     y++;
     }
     */
    
    for(int n = 0; n < fin.length; n++){
      if(a[x] < b[y]){
        fin[n] = a[x];
        x++;
      }
      else{
        fin[n] = b[y];
        y++;
      }
    }
    
    
    return fin;
  }
  
  public static int[] sort(int[]data){
    if(data.length<2){
      return data;
    }
    
    else{
      int[] a = new int[data.length/2];
      int[] b = new int[data.length - a.length];
      for(int x = 0; x < a.length; x++){
        a[x] = data[x];
      }
      for(int n = 0; n < b.length; n++){
        b[n] = data[n + a.length];
      }
      a = sort(a);
      b = sort(b);
      data = merge(a,b);
      
    }
    return data;
  }
  
  public static void main(String[]args){
    int[] a = {0,45};
    int[] b = {1};
    int[] c = {2};
    System.out.println(b[0]);
    System.out.println(java.util.Arrays.toString(merge(b,c)));
    System.out.println(java.util.Arrays.toString(sort(a)));
  }
  
  
  
}
