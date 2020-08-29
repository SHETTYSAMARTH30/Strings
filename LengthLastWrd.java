class LengthLastWrd {
    public int lengthOfLastWord(String s) {
        
        int length = 0;
        int p = s.length() - 1;
        
        while(p >= 0){
            
            if(s.charAt(p) != ' ')
                length++;
            
            else if(length > 0)
                    break;
            
            p--;
        }
        
        return length;
    }
}
