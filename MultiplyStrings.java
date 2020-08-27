class MultiplyStrings {
    public String multiply(String num1, String num2) {
        
        int m = num1.length();
        int n = num2.length();
        
        //The resultant array will be of size m+n
        int[] pos = new int[m + n];
        
        //Now we will perform the normal multiplication
        for(int i = m-1; i >= 0; i--){
            
            for(int j = n-1; j >=0; j--){
                
                //After mul 2 number we store the digits at index i+j and i+j+1
                int p1 = i + j;
                int p2 = i + j + 1;
                
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                //We add the prev value if present to sum
                int sum = mul + pos[p2];
                
                //The value in the tens place
                pos[p1] += sum / 10;
                
                //The value in the units place
                pos[p2] = sum % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int p : pos){
            
            if(!(sb.length() == 0 && p == 0))
                sb.append(p);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
        
    }
}
