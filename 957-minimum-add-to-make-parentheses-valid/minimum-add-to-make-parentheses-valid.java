class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> stack = new Stack<>();
        int count=0;
      // agr open bracket hai to if aagr closing bhi exist karta hai top pe to pop otherwise count ++
      for(char ch : s.toCharArray()){
        
        if(ch=='('){
            stack.push(ch);
        }
        else{
           
            if ( !stack.isEmpty() && ch==')' && stack.peek()=='('){
                stack.pop();
            }
            else{
                count++;
            }
        }
      }
      // above code handle every closing bracket cond but if there is no closing bracket then 
      return count+stack.size(); 
    }
}