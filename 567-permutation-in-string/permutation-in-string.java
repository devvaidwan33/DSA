class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // we take two maps and use .equals method to compare their key with values with each other without looking the order
       
        Map <Character,Integer> map1 = new HashMap<>();
        Map <Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int start=0;
        int end=0;
        while(end<s2.length()){
            char ch = s2.charAt(end);
           map2.put(ch,map2.getOrDefault(ch,0)+1);
           // know we have to maps
           // window is valid till the windowlenght is smaller to length od s1
           while(end-start+1 >= s1.length()){
            // hum isme jabhi aayenge jab map1 or map2 m equal no of element honge
            // so compare first then make window invalid
            if(map1.equals(map2)){
                return true;
            }
            char removed = s2.charAt(start);
            map2.put(removed,map2.getOrDefault(removed,0)-1);
            // agar kisi bhi number ki occurence(value) 0 ho gyi matlab vo s1 m present nhi hai
            if(map2.get(removed)==0){
                map2.remove(removed);
            }
            start++;
           }
           end++;
        }
        return false;
    }
}