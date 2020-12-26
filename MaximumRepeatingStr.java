class MaximumRepeatingStr {
    public int maxRepeating(String sequence, String word) {
        
        //We can even take this as StringBuilder, just replace + by append below
        String s = word;
        
        int result = 0;
        
        while(sequence.contains(s)){
            
            result++;
            s += word;
        }
        
        return result;
        
    }
}
