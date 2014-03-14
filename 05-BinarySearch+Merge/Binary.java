public class Binary{
  public int rbsearch(int n, int[] L){
    int a = L.length/2;
    if(L[a] == n){
      return a;
    }
    if(L[a]< n){
      int[] ne = new int[a];
      for( int x = 0; x < a; x ++){
        ne[x] = L[x];
      }
      return rbsearch(n,ne);
    }
    if(L[a]> n){
      int[] me = new int[a];
      for(int v = 0; v < a; v++){
        me[v] = L[a+v];
      }
      
      return a + rbsearch(n,me);
    }
    
    return -1;
    
  }
  
  public int ibsearch(int n , int[] L){
    int a = L.length/2;
    int b = L.length;
    while(L[a] != n){
      
      if(L[a] > n){
        
        a = a/2;
      }
      if(L[a] < n){
        a = a + a/2;
      }
    }
    
  }
}
