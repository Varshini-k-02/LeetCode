class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ans[]=mergeSort(nums1,nums2,m,n);
        for(int x=0;x<m+n;x++){
            nums1[x]=ans[x];
        }
    }
    public static int[] mergeSort(int[] arr1,int[] arr2,int m,int n){
        int[] mix=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                mix[k]=arr1[i];
                i++;
            }
            else{
                mix[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
             mix[k]=arr2[j];
             j++;
             k++;
        }
        return mix;
    }
}