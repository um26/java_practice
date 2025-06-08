// User function Template for Java

class Solution {
    int maxRepeating(int k, int[] arr) {
        // code here
        int rep[]= new int[k];
        for(int i=0;i<k;i++){
            rep[i]=0;
        }
        
        for(int i=0;i<arr.length;i++){
            rep[arr[i]]++;
        }
        int max=0;
        for(int i =0;i<k;i++){
            if(rep[max]<rep[i]){
                max=i;
            }
        } //System.out.println(max);
        return max;
    }
}
