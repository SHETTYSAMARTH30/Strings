class ShiftLetter {
    public String shiftingLetters(String S, int[] shifts) {
        
        //Calculate total shifts to do for each index
        for(int i = shifts.length - 2; i >= 0; i--){
            
            shifts[i] = (shifts[i] + shifts[i+1]) % 26;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < S.length(); i++){
            
            //let a = 0, b = 1 ... z = 25. After adding shift it can be > 26 hence we do % 26. We do plus 'a' because we need to convert letters from 0 to 26 to ascii ie 97 to 122 range.
            sb.append((char)((S.charAt(i) - 'a' + shifts[i]) % 26 + 'a'));
            
        }
        
        return sb.toString();
    }

}
