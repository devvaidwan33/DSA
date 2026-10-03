class Solution {
    //longest substring
    public int lengthOfLongestSubstring(String s) {
        // if there is with repeating characters use hashmap
        // if there is without repeating characters use hashset
        if(s.length()==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int start=0;
        int end=0;
        int windowLen=0;
        int maxLen=Integer.MIN_VALUE;
        while(end<s.length()){
            // intially set empty rhega to ye condition nhi chalgi phle jab tak set ke andar kuch dal na de
            // jab tak set ke andar vo char hai jo end p hai remove karte rhe us start p jo char hai
            // bcz start set m jop phla ele hai us p hoga 
            //{ (s)a b c } end=(a) so jab tak start a ke == hai remove karte rho a ko bcz kitne bhi repeating 
            // characters ho skte hai
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            windowLen=end-start+1;
            maxLen=Math.max(maxLen,windowLen);
            end++;
        }
        return maxLen;
                                                                                                                                                                                                                                                                                                                
    }

}