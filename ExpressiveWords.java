class ExpressiveWords {
    public int expressiveWords(String S, String[] words) {
        
        RLE r1 = new RLE(S);
        
        int ans = 0;
        
        search: for(String word : words){
            
            RLE r2 = new RLE(word);
            
            //If the unique letters of the word and S are not equal then we cannot create expressive words out of word
            if(!r1.key.equals(r2.key))
                continue;
            
            //If the 2 words have same unique letters, we check the occurences of the letters
            for(int i = 0; i < r2.counts.size(); i++){
                
                //We fetch total number of ith char in both S and word
                int c1 = r1.counts.get(i);
                int c2 = r2.counts.get(i);
                
                //If a letter is less than 3 and the occurence in S is not equal to occurence in word then it means we cant extend the letter in word to create expressive word S as the final letters should be >=3
                if(c1 < 3 && c1 != c2)
                    continue search;
                
                //If letters are more in word than in S, we cant decrement letters in word
                else if(c2 > c1)
                    continue search;
                
            }
            
            ans++;
        }
        
        return ans;
        
    }
    

class RLE {
    
    String key;
    List<Integer> counts;
    
    public RLE(String S){
        
        counts = new ArrayList<Integer>();
        
        StringBuilder sb = new StringBuilder();
        
        int prev = -1;
        int N = S.length();
        
        for(int i = 0; i < N; i++){
            
            if(i == N-1 || S.charAt(i) != S.charAt(i+1)){
                
                counts.add(i - prev);
                sb.append(S.charAt(i));
                prev = i;
            }
        }
        
        key = sb.toString();
    }
    
}
}
