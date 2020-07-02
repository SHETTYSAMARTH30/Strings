class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        //If a string is palindrome then the first half and the reverse of 2nd half of string is equal
        //We start checking from 2 ends of the string
        
        for(int i = 0, j = s.length()-1; i < j; i++, j--){
            
            //We skip the non alphanumeric characters
            while(i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            
            while(i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            
            //If 2 letters are not equal then its not palindrome hence false
            if(i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        
        //If half of the string is scanned completely then we return true
        return true;
    }
}
