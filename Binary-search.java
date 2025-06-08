class Solution {
    public int binarysearch(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(k==arr[mid]){
                int val=mid;
                for(int i=val-1;i>=low;i--){
                    if(arr[val]==arr[i]){
                        val=i;
                    }
                }
                return val;
            }
            else if(k<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
