class Solution {
    public String minRemoveToMakeValid(String s) {
       Stack<Character> stack = new Stack<>();
       ArrayList<Character> list = new ArrayList<>();
       for(char ch : s.toCharArray()){
        if(ch=='('){
            stack.push(ch);
            list.add(ch);
        }
        else if(!stack.isEmpty() && ch==')' && stack.peek()=='('){
            stack.pop();
            list.add(ch);
        }
        else if(ch!='(' && ch!=')'){
            list.add(ch);
        }
       }

       // remove those ope brackets which are extra when adding whilen pushing which have no closing bracktes
       while(!stack.isEmpty()){
         char ch = stack.pop();
        // give last index of list bcz remaing open brackters are in last
        list.remove(list.lastIndexOf(ch));
       }

       StringBuilder sb = new StringBuilder();
       for( char ch : list){
        sb.append(ch);
       }
       return sb.toString();
    }
}