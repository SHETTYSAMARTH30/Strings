class CountSubstringOneLetter {
    public int countLetters(String S) {
        
        //It stores the count of number of consecutive repeating letters
        int repeat = 1;
        int ans = 0;
        
        for(int i = 1; i < S.length(); i++){
            
            //If the consecutive characters are not equal
            if(S.charAt(i) != S.charAt(i-1)){
                
                //Formula to calculate number of substrings with 1 distinct letter in a substring
                ans += repeat * (repeat + 1)/2;
                repeat = 0;
            }
            
            repeat++;
        }
        
        //To calculate the substring with last letter, since we dont cover the last letter in the for loop above, we just calculated till 2nd last letter
        
        ans += repeat * (repeat + 1)/2;
        
        return ans;
    }
}
