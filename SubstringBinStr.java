class SubstringBinStr {
    public boolean queryString(String S, int N) {
        
        for(int i = 1; i <= N; i++){
            
            //If the substring is not present in S then it returns -1 else it returns the index of the occurence of starting character
            if(S.indexOf(Integer.toBinaryString(i)) < 0)
               return false;
        }
               
        return true;
    }
}
