class MorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> uniqueMorse = new HashSet<String>();
        
        for(String w : words){
            
            StringBuilder sb = new StringBuilder();
            
            for(char ch : w.toCharArray()){
                
                //To fetch each of the 26 letters morse code from array
                sb.append(morse[ch - 'a']);
            }
            
            uniqueMorse.add(sb.toString());
        }
        
        return uniqueMorse.size();
        
    }
}
