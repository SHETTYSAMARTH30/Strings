class RevVowels {
    public String reverseVowels(String s) {
        
        Set<Character> isVowel = new HashSet(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        int start = 0;
        int end = s.length() - 1;
        
        char chars[] = s.toCharArray();
        
        while(start < end){
            
            while(start < end && !isVowel.contains(chars[start]))
                start++;
            
            while(start < end && !isVowel.contains(chars[end]))
                end--;
        
            //Swapping 2 vowels
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            //going to index after vowel
            start++;
            end--;
            
        }
        
        return new String(chars);
    }
}
