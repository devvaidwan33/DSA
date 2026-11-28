class Solution {
    public String removeKdigits(String num, int k) {
        // how to think about stack
        // if from the starting if the curr digit is greater than next so if remove the curr digit the number become smaller----can use monotonic stack
        // i.e 1 or 4 m se we have to remove 4 and 4 or 3 me se 3 and 3 or 2 me se 2 
        // so hamara result agle number p depend karta hai ki vo number greater hai smaller
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // we store indeices of charcter so digit which is smaller than previous digit
        for(int i=0;i<num.length();i++){
            
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k> 0 && num.charAt(stack.peek())>ch){
                stack.pop();
                k--;
            }
            
            stack.push(i);
        }
        // agr k ki value bach gyi pop operation se to top se remove kardo
        while(k>0){
            stack.pop();
            k--;
        }

        for(int index : stack){
            sb.append(num.charAt(index));
        }
        //starting ki extra zeros hatao
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0'){
            sb.deleteCharAt(i);
        }
        String result = sb.toString();
  
        if(result==""){
            return "0";
        }
        return result;

        
    }
}