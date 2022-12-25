class Main{
 public static void main(String[] args){
  int arr[]={2,3,10,7,4,1};
  System.out.println(find(arr));   
 }
  static int find(int[] arr){
    int s=0,e=arr.length-1;
    while(s<e){
     int mid=s+(e-s)/2;
     if(arr[mid]>arr[mid+1])
       e=mid;
      else
        s=mid+1;
    }
    return s;
  }
}

//Returns the index of the peak element in the mountain array or Biotonic array
