class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length , n = arr[0].length;
        int right = 0 , left = n-1;
        while(right<m && left>=0){
            if(arr[right][left]>target) left--;
           else if(arr[right][left]<target) right++;
            else return true;
        }
        return false;
    }  
}
