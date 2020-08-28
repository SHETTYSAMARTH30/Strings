class DefangingIPV4 {
    public String defangIPaddr(String address) {
        
        //return address.replace(".","[.]");
        
        //return address.replaceAll("\\.","[.]");
        
        //return String.join("[.]",address.split("\\."));
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : address.toCharArray()){
            
            sb.append(ch == '.' ? "[.]": ch);
        }
        
        return sb.toString();
    }
}
