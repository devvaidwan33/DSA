class Solution {
    public int totalFruit(int[] arr) {
        // we have given two baskets each can hold only i type of number i.e either 1 or 2 or 3 but can be multiple 1s 11111 or 2s 22222 no limit
        //so we take a map and put end with freq. if size of map>2 window become invalid
        Map<Integer,Integer> map = new HashMap<>();
        int start=0;
        int end=0;
        int windowLen=0;
        int maxLen=Integer.MIN_VALUE;
        while(end<arr.length){
            map.put(arr[end],map.getOrDefault(arr[end],0)+1);
            while(map.size()>2){ // it will run only for size> 3,4,5,6 not for 2
                map.put(arr[start],map.getOrDefault(arr[start],0)-1);
                // if after remove 1 freq of start if start still greater than 0 i.e after remove start from window there is still start type of fruit in this window so size will not decrease
                // and if after removing start it becomes 0 i.e no fruit is start type in window so remove start type fruit from window and decrese size od map bcz this fruit is no longer in bascket
                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }
                start++;
            }
            windowLen=end-start+1;
            maxLen=Math.max(windowLen,maxLen);
            end++;
        }
        return maxLen;
    }
}