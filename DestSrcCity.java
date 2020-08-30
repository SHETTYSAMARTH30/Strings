class DestSrcCity {
    public String destCity(List<List<String>> paths) {
        
        Set<String> srcCities = new HashSet<>();
        
        //We add all the source cities ie column 1 of path
        for(List<String> path : paths){

            srcCities.add(path.get(0));
        }
        
        //Now we check whether any destination city is present in source city set or not ie column2
        for(List<String> path : paths){
            
            //If any destination is not in set then we return that city
            if(!srcCities.contains(path.get(1)))
                return path.get(1);
        }
        
       return "NO";
        
        
    }
}
