class DeleteVowels {
    public String removeVowels(String S) {
        
        // return S.replaceAll("[aeiou]","");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < S.length(); i++){
            
            char ch = S.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            else
                sb.append(ch);
            
        }
        
        return sb.toString();
    }
}
