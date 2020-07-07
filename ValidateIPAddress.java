class ValidateIPAddress {
    public String validIPAddress(String IP) {
        
        if(IP.chars().filter(ch -> ch == '.').count() == 3){
            return validateIPv4(IP);
        }
        
        else if(IP.chars().filter(ch -> ch == ':').count() == 7){
            return validateIPv6(IP);
        }
        
        else return "Neither";
    }
    
    public String validateIPv6(String IP){
        
        String hex = "0123456789abcdefABCDEF";
        String[] nums = IP.split(":",-1);
        
        for(String x : nums){
            
            //Length must be bet 0 and 4
            if(x.length() == 0 || x.length() > 4)
                return "Neither";
            
            //All the characters must be hexadecimal 0-9,a-f,A-F
            for(char ch : x.toCharArray()){
                
                if(hex.indexOf(ch) == -1)
                    return "Neither";
            }
        }
        
        return "IPv6";
        
    }
    
    public String validateIPv4(String IP){
        
        String[] nums = IP.split("\\.",-1);
        
        for(String x : nums){
            
            // Validate integer in range (0, 255):
            //Total digits must be bet 1 to 3
            if(x.length() == 0 || x.length() > 3)
                return "Neither";
            
            //There should not be leading 0 to any number
            if(x.charAt(0) == '0' && x.length() != 1)
                return "Neither"; 
            
            //All the characters must be decimal number
            for(char ch : x.toCharArray()){
                
                if(!Character.isDigit(ch))
                    return "Neither";
            }
            
            //The number shouldnt be > 255
            if(Integer.parseInt(x) > 255)
                return "Neither";
             
        }
        
        return "IPv4";
        
    }
}
