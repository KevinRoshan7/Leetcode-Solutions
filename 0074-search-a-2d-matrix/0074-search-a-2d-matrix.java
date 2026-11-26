class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target>=matrix[mid][0]&&target<=matrix[mid][m-1])
            return Arrays.binarySearch(matrix[mid],target)>=0;
            else if(target>matrix[mid][0])
            l=mid+1;
            else
            r=mid-1;
        }
        return false;
    }
}