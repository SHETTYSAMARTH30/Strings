class GoatLatin {
    public String toGoatLatin(String S) {
        
        Set<Character> vowels = new HashSet(){
            {
                add('a');
                add('e');
                add('i');
                add('o');
                add('u');
                add('A');
                add('E');
                add('I');
                add('O');
                add('U');
            }
        };
        
        String[] words = S.split(" ");
        
        String temp = "";
        
        //We will append our goat latin words to it
        StringBuilder goatLatin = new StringBuilder();
        
        for(String s : words){
            
            temp += 'a';
            
            //If the word is a consonant
            //Then remove the first letter and append it to end 
            if(!vowels.contains(s.charAt(0))){
                
                s = s.substring(1) + s.charAt(0);
            }
            
            goatLatin.append(s).append("ma").append(temp).append(' ');
            
        }
        
        //Remove extra space at the end
        goatLatin.deleteCharAt(goatLatin.length() - 1);
        
        return goatLatin.toString();
    }
}
