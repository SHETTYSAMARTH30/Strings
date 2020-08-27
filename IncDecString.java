class IncDecString {
    public String sortString(String s) {
        
        //It will keep the frequency of each character in the String
        int count[] = new int[26];
        
        for(char ch : s.toCharArray()){
            
            count[ch-'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        
        while(result.length() < s.length()){
            
            //Now to search from small to largest, We will travel from a to z and append each char to result if there is a frequency
            for(int i=0; i < 26; i++){
                
                //The character exists hence we append it to result
                if(count[i] != 0){
                    
                    result.append((char)(i + 'a'));
                    count[i]--;
                }
            }
            
            //Now to search largest to smallest, travel from z to a
            for(int i=25; i >= 0; i--){
                
                if(count[i] != 0){
                    
                    result.append((char)(i + 'a'));
                    count[i]--;
                }
            }
        }
        
        return result.toString();
    }
}
