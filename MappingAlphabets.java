class MappingAlphabets {
    public String freqAlphabets(String s) {
        
        Map<String,Character> map = new HashMap<>();
        
        int num = 1;
        
        for(char c = 'a'; c <= 'z'; c++){
            
            if(c < 'j'){
                
                map.put(String.valueOf(num++),c);
            }
            else{
                
                map.put(String.valueOf(num++)+"#",c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        
        while(i >= 0){
            
            if(s.charAt(i) == '#'){
                
                char ch = map.get(s.substring(i - 2,i + 1));
                sb.append(ch);
                i -= 3;
            }
            else{
                
                char ch = map.get(s.substring(i,i+1));
                sb.append(ch);
                i--;
            }
        }
        
        return sb.reverse().toString();
        
    }
}
