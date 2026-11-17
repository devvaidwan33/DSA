class Solution {
    public boolean isValid(String s) {
       Stack <Character> stack = new Stack<>();
       for( char ch : s.toCharArray()){
        if(ch=='(' || ch=='{' || ch=='['){
            stack.push(ch);
        }
        else{
            // work if there is only closing brackets and every time we pop them
            if(stack.isEmpty()){
                return false;
            }
            // return the top element and also delete it
           char top= stack.pop();
           // agr char ek closing bracket hai or top pe uska closing bracket nhi hai to false
            if(ch==')' && top !='('){
            return false;
           }
           else if(ch=='}' && top !='{'){
            return false;
           }
           else if(ch==']' && top !='['){
            return false;
           }
        }
       }

       return stack.isEmpty(); 
        
    }
}