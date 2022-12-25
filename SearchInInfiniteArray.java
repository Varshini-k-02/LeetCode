class Main{
 public static void main(String[] args){
  int arr[]={2,3,6,8,9,12,15};
  int target=15;
  System.out.println(boxSize(arr,target));
 }
  static int boxSize(int[] arr,int target){
      int s=0,e=1;
      while(target>arr[end]){
          int temp=end+1;
          end+=(end-start+1)*2;
          start=temp;
      }
    return binarySearch(arr,target,s,e);
  }
  static int binarySearch(int arr[],int target,int s,int e){
      while(s<=e){
        int mid=s+(s-e)/2;
        if(target<arr[mid])
          e=mid-1;
        else if(target>arr[mid])
          s=mid+1;
        else
          return mid;
      }
    return -1;
  }
}
