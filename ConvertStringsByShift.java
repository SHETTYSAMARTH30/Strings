class ConvertStringsByShift {
    public boolean canConvertString(String s, String t, int k) {
        
        //If both the strings are not of equal size then false
        if(s.length() != t.length())
            return false;
        
        //The difference between any 2 letter will be between 0 and 26. This array is used to keep count of how many times a diff is repeated. If 'a' - 'b' = 1, and then again we come across 'a'-'b' now we will so 27 shifts instead of 1 (as 1 is already done), 3rd time we will do 53 shifts. ie diff + count * 26 shifts;
        int count[] = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            
            //+26 is done cuz; if we want to shift from z to a we do a - z hence diff is negative , so we add +26 and wrap around
            int diff = (t.charAt(i) - s.charAt(i) + 26) % 26;
            
            //If 2 letters are not equal then we check whether diff is greater then k or not. If add 26*count incase the sifting number is previously used.
            if(diff > 0 && diff + count[diff] * 26 > k)
                return false;
            
            //We keep the count of how many times a shifting number is used. 2nd time we do + 26, 3rd time + 2*26
            count[diff]++;
        }
        
        return true;
        
    }
}
