class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String n="123456789";
        String l=Integer.toString(low);
        String h=Integer.toString(high);
        int c=0;
        List<Integer> x=new ArrayList<>();
        for(int i=l.length();i<=h.length();i++){
            for(int j=0;j<=9-i;j++){
                int num=Integer.parseInt(n.substring(j,j+i));
                if(num<=high&&num>=low)
                x.add(num);
            }
        }
        return x;
    }
}