class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int mx=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>mx){
                    mx=arr[j];
                }
            }
            arr[i]=mx;

        }
        return arr;
    }
}