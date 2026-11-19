class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> stack1 = new Stack<>();
      Stack<Character> stack2 = new Stack<>();
      for(char ch :s.toCharArray() ){
        if(!stack1.isEmpty() && ch=='#'){
            stack1.pop();
        }
        else{
            if(ch=='#'){
                continue;
            }else{
            stack1.push(ch);
        }
        }
      }
      for(char ch :t.toCharArray() ){
        if(!stack2.isEmpty() && ch=='#'){
            stack2.pop();
        }
        else{
            if(ch=='#'){
                continue;
            }else{
            stack2.push(ch);
        }
        }
      }
      return stack1.equals(stack2);

    }
}