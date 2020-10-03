class ReverseString2 {
    public void reverseWords(char[] s) {
        
        //Step1 - Reverse the entire array
        reverse(s, 0, s.length - 1);
        
        //Step2 - Reverse each word inside the array
        reverseEachWrd(s);
        
    }
    
    public void reverseEachWrd(char[] s){
        
        int start = 0;
        int end = 0;
        int len = s.length;
        
        while(start < len){
            
            //Move until we find an entire word
            while(end < len && s[end] != ' ')
                end++;
            
            //We reverse a word
            reverse(s,start,end - 1);
            
            //Points to 1 char after blank space
            start = end + 1;
            end++;
        }
        
    }
    
    public void reverse(char[] s, int start, int end){
        
        while(start < end){
            
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
