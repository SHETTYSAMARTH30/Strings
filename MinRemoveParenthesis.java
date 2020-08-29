class MinRemoveParenthesis {
    public String minRemoveToMakeValid(String s) {
        
        //We will store the indexes which are to be removed to make string balanced
        Set<Integer> removeIndexes = new HashSet<Integer>();
     
        //We will store the indexes of opening parenthesis
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i < s.length(); i++){
           
            //If we find an opening parenthesis push to stack
            if(s.charAt(i) == '('){
                
                stack.push(i);
            }
            
            else if(s.charAt(i) == ')'){
                
                //If stack is empty that means there is excess of closing parenthesis, hence we put its index to set
                if(stack.isEmpty())
                    removeIndexes.add(i);
                
                //If there are opening parenthesis in stack, that means its balanced hence we remove index from stack
                else
                    stack.pop();
                    
            }
        }
        
        //After iterating entire string if the stack is not empty that means we have more opening brackets, so we add them to set
        
        while(!stack.isEmpty()){
            
            removeIndexes.add(stack.pop());
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        //Now all the indexes which are to be removed are in the set, so only append the indexes which are not in set
        
        for(int i=0; i < s.length(); i++){
            
            if(!removeIndexes.contains(i))
                sb.append(s.charAt(i));
        }
        
        return sb.toString();
    
    }
}
