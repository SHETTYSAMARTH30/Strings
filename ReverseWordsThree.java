class ReverseWordsThree {
    public String reverseWords(String s) {
        
        //To save each word
        StringBuilder word = new StringBuilder();
        
        //To save the entire result
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i < s.length(); i++){
            
            if(s.charAt(i) == ' '){
                
                result.append(word.reverse() + " ");
                
                //We discard the last saved word
                word.setLength(0);
            }
            else{
                
                word.append(s.charAt(i));
            }
        }
        
        return result.append(word.reverse()).toString();
    }
}
