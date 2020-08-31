class IntToRoman {
    public String intToRoman(int num) {
        
        //We have 13 unique romane symbols and values 
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        //We iterate through largest to smallest values as largest symbol is always choses
        for(int i = 0; i < values.length && num > 0; i++){
            
            //We have to find the largest symbol which is smaller than the given number
            while(values[i] <= num){
                
                //We decrement value, and then find symbol for the remainder value
                num -= values[i];
                sb.append(symbols[i]);
            }
            
        }
        
        return sb.toString();
     
    }
}
