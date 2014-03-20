public class QuickSelect{
  
  public int Quickselect(int[] a,int k,int low,int high){
    int pivot = high/2;
    if (low >= high)
      return a[low];
    pivot = partition(a,pivot,low,high);
    if(k == pivot){
      return a[pivot];
    }
    else if(k<pivot){
      return Quickselect(a,k,low,high-1);
    }
    else if(k>pivot){
      return Quickselect(a,k,low+1,high);
    }
      return -1;
  }
  
  public int partition(int[] a,int k,int low,int high){
    int n = a[k];
    while(low != high){
      if(a[low] < n){
        low ++;
      }
      if(a[high] > n){
        high --;
      }
      int temp = a[low];
      int temp1 = a[high];
      a[low]= temp1;
      a[high]= temp;
    }
    return low;
  }
}
