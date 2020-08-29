class GenOddStr {
    public String generateTheString(int n) {
        
        int k = (n % 2 == 0) ? n - 1 : n;
        
        char c[] = new char[n];
        
        for(int i = 0; i < k; i++){
            
            c[i] = 'a';
        }
        
        if(k != n){
            
            c[n-1] = 'b';
        }
        
        return String.valueOf(c);
    }
}
