class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        // we make two maps for s and p whenever the map1.euals(map2) add the start index in list
        Map <Character,Integer> map1 = new HashMap<>();
        Map <Character,Integer> map2 = new HashMap<>();
       for(int i=0; i<p.length(); i++){
        char ch = p.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
       } 
       int start=0;
       int end=0;
       while(end<s.length()){
        char ch = s.charAt(end);
         map2.put(ch,map2.getOrDefault(ch,0)+1);
         while(end-start+1 >= p.length()){
            if(map1.equals(map2)){
                list.add(start);
            }
            char removed = s.charAt(start);
            map2.put(removed,map2.getOrDefault(removed,0)-1);
            if(map2.get(removed)==0){
                map2.remove(removed);
            }
            start++;
         }
         end++;
       }
       return list;
    }
}