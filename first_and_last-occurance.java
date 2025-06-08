class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        int Firstoccur= searchLeft(arr,x);
        int Lastoccur= searchRight(arr,x);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Firstoccur);
        result.add(Lastoccur);

        return result;
    }

    public int searchLeft(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int Firstoccur=-1;
            while(high>=low){
                int mid=low+(high-low)/2;
                if(x==arr[mid]){
                    Firstoccur=mid;
                    high=mid-1;
                }
                else if(x<arr[mid]){
                    high=mid-1;
                }
                else if(x>arr[mid]){
                    low=mid+1;
                }
            }
            return Firstoccur;
        }

        public int searchRight(int[] arr, int x){
            int low=0;
            int high=arr.length-1;
            int Lastoccur=-1;
            while(high>=low){
                int mid=low+(high-low)/2;
                if(x==arr[mid]){
                    Lastoccur=mid;
                    low=mid+1;
                }
                else if(x<arr[mid]){
                    high=mid-1;
                }
                else if(x>arr[mid]){
                    low=mid+1;
                }
            }
            return Lastoccur;
        }
}
