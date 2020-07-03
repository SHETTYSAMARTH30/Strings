class DecodeString {
    public String decodeString(String s) {
        
        String res = "";
        
        //Used for storing the count
        Stack<Integer> countStack = new Stack<>();
        
        //Used to store the res
        Stack<String> resStack = new Stack<>();
        
        int idx = 0;
        
        while(idx < s.length()){
            
            if(Character.isDigit(s.charAt(idx))){
                
                int count = 0;
                
                while(Character.isDigit(s.charAt(idx))){
                    
                    count = count * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            
            else if(s.charAt(idx) == '['){
                
                resStack.push(res);
                res = "";
                idx++;
            }
            else if(s.charAt(idx) == ']'){
                
                StringBuilder sb = new StringBuilder(resStack.pop());
                int repeat = countStack.pop();
                
                for(int i=0; i<repeat; i++){
                    
                    sb.append(res);
                }
                
                res  = sb.toString();
                idx++;
                
            }
            else{
                
                res += s.charAt(idx++);
            }
        }
        
        return res;
        
    }
}
