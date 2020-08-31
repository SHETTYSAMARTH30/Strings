class SubstringsWith3Char {
    public int numberOfSubstrings(String s) {
        
//Take three pointers l1, l2, l3 for a, b and c respectively.Now as you iterate over the string of length n, you can count the number of sub-strings ending at that particular index.How can we do that is here ->

//Keep on updating l1, l2 and l3.
//And take the minimum of l1, l2 and l3.
//Now from this min-index (min(l1, l2, l3) to the curr index i this is the smallest possible sub-string ending at curr-index i which follows the constraint.
//If the smallest sub-string is from min-index to curr-index, then for every sub-string starting from index 0, 1, 2, 3, ......min-index and ending at curr-index is valid, (So how many are these...... So there are min-index + 1 sub-strings)
//Add this min-index + 1 to the count.
        
        int count[] = {-1,-1,-1};
        
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            count[s.charAt(i) - 'a'] = i;
            
            result += 1 + Math.min(count[0], Math.min(count[1],count[2]));
        }
        
        return result;
        
    }
}
