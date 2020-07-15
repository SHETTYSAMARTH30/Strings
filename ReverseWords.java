class ReverseWords {
    public String reverseWords(String s) {
        
        int left = 0;
        int right = s.length()-1;
        
        //We rem left leading spaces
        while(left <= right && s.charAt(left) == ' ')
            left++;
        
        //We remove trailing right spaces
        while(left <= right && s.charAt(right) == ' ')
            right--;
        
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder word = new StringBuilder();
        
        //We push each word into the stack, so when we fetch it we get output as reverse
        while(left <= right){
            
            char c = s.charAt(left);
            
            //If we face 1st blank space in between 2 words, push the word to stack and set word length as 0.
            if(word.length() != 0 && c == ' '){
                
                deque.addFirst(word.toString());
                //word = new StringBuilder();
                word.setLength(0);
            }
            else if(c != ' '){
                
                word.append(c);
            }
            
            left++;
            
        }
        
        //Since left stops as we reach right, we are unable to add the last word
        deque.addFirst(word.toString());
        //It will add spaces between diff words in stack
        
        return String.join(" ",deque);
        
    }
}
