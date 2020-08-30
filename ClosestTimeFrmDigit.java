class ClosestTimeFrmDigit {
    public String nextClosestTime(String time) {
        
        int hours = Integer.parseInt(time.substring(0,2));
        int mins = Integer.parseInt(time.substring(3));
        
        //we get the current time in minutes
        int curr = hours * 60 + mins;
        
        Set<Integer> digitAllowed = new  HashSet<>();
        
        //Add each unique digit to the set
        for(char c : time.toCharArray()){
            
            if(c != ':')
                digitAllowed.add(c - '0');
        }
        
        while(true){
            
            //Our time lies between 0 and 24*60 in the 24 hour cycle. So we increment our current time and see what is the closest time that contains all the digits from digit set ; 0 >= t <= 24*60
            curr = (curr + 1) % (24 * 60);
            
            //To get hour from time we do time/60
            int curHour = curr / 60;
            
            //To get mins in 60s from total time we do time%60
            int curMin = curr % 60;
            
            //To get 1st digit we do /10 and 2nd digit we do %10.
            int[] curTime  = {curHour/10, curHour%10, curMin/10, curMin%10};
            
            int flag = 0;
            
            for(int i : curTime){
                
                if(!digitAllowed.contains(i)){
                    
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 0)
                return String.format("%02d:%02d", curHour, curMin);
            
        }
    }
}
