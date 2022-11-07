#It is a technique that is used the find the sum with a fixed window size in the array
#If the array is 1,2,3,4,5,6 and k=3, We need to find the largest sum having just 3 numbers. Here it will be 4+5+6=15
  
#Code
class Main{
public static void main(String[] args){
  int i,wind_sum,max_sum;
  for(int i=0;i<k;i++){
    wind_sum+=arr[i];
  }
  max_sum=wind_sum;
  for(i=k;i<n;i++){
    wind_sum+=arr[i]-arr[i-k];
    max_sum=Math.max(max_sum,wind_sum);
  }
  System.out.println("Largest sum with window size "+k+" is"+max_sum);
}
}
