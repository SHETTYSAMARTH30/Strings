class CapitalDetection {
    public boolean detectCapitalUse(String word) {
       
        int n = word.length();
        
        //If there is only 1 letter then if it is small or Capital it satisfies both condition 1 or 2
        if(n == 1)
            return true;
        
        //If the first and 2nd char of word is capital then we will check whether it satisfies condition 1 ie rem n-2 must be CAP
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            
            for(int i=2; i < n; i++){
                
                if(Character.isLowerCase(word.charAt(i)))
                    return false;
            }
        }
        //If the 1st and 2nd char is Capital or lowercase then we check whether the rem n-1 char satisfies 2nd/3rd condition
        else{
            
            for(int i=1; i < n; i++){
                
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            
        }
        
        //If none of the conditions fail then we return true
        return true;
    }
}
