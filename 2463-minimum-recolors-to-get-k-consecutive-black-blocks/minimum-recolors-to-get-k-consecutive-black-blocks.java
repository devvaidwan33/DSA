class Solution {
    public int minimumRecolors(String s, int k) {

        int start=0;
        int end=0;
        int minCount=Integer.MAX_VALUE;
        int count=0;
        while(end<s.length()){
            if(s.charAt(end)=='W'){
                count++;
            }
            if(end-start+1==k){
                minCount=Math.min(count,minCount);
                if(s.charAt(start)=='W'){
                    count--;
                    start++;
                }
                else{
                    start++;
                }
            }
            end++;
        }
        return minCount;
    }
}