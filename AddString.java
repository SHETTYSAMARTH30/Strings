class AddString {
    public String addStrings(String num1, String num2) {
        
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        
        int carry = 0;
        
        StringBuilder result = new StringBuilder();
        
        while(p1 >=0 || p2 >= 0){
            
            int sum = carry;
            
            //To check whether char in num1 are left or not
            if(p1 >= 0){
                
                sum += num1.charAt(p1--) - '0';
            }
            
            //To check whether char in num2 are left or not
            if(p2 >= 0){
                
                sum += num2.charAt(p2--) - '0';
            }
            
            result.append(sum % 10);
            
            carry = sum /10;
        }
        
        if(carry != 0)
            result.append(carry);
        
        //We will reverse the String since we started adding from 1s place
        return result.reverse().toString();
    }
}
