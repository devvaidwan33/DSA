class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // need to make incearsing monotonic stack for last element and for other element decreasing monotonic stack
       Stack<Integer> stack = new Stack<>();
       int[] result = new int[nums.length];
       // increasing monotonic stack for last element bcz we need closest greater ekement but from starting i.e from left to right
       // we need closest greater element from right to left then have to make decreasing monotonic stack
       for(int i=nums.length-2; i>=0; i--){
        // if curr ele is greater than no problem just put it that is we need greater ele on top
        // but if curr ele is smaller than we need to put is above the smaller ele than curr ele
        // so pop while we got a smaller ele or while curr ele < peek
        while(!stack.isEmpty() && nums[i]>=stack.peek()){
            stack.pop();
        }

            stack.push(nums[i]);
       }
     

       for(int i=nums.length-1; i>=0; i--){
       
            while(!stack.isEmpty()&& nums[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=-1;
                
            }
            else{
                result[i]=stack.peek();
                
            }
        stack.push(nums[i]);



       } 
       return result;
    }
}