class Solution {
    public int[] getOrder(int[][] tasks) {
        PriorityQueue<int []> x=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])
            return a[1]-b[1];
            return a[2]-b[2];
        });
             
        int n=tasks.length,r[]=new int[n];
        int e=0,i=0,j=0;
        int arr[][]=new int[n][3];
        for(int k=0;k<n;k++){
            arr[k][0]=tasks[k][0];
            arr[k][1]=tasks[k][1];
            arr[k][2]=k;
        }
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
        while(i<n||x.size()!=0){
            if(x.isEmpty()&&e<arr[i][0])
            e=arr[i][0];
            while(i<n&&arr[i][0]<=e){
                x.offer(arr[i]);
                i++;
            }
            int a[]=x.poll();
            e+=a[1];
            r[j++]=a[2];
        }
        return r;
    }
}