class DuplicateFiles {
    public List<List<String>> findDuplicate(String[] paths) {
        
        //it will store key = content and value = directory/file_name
        Map<String, List<String>> res = new HashMap<>();
        
        for(String path : paths){
            
            //each string is split by blank space
            String[] values = path.split(" ");
            
            //We iterate each filename/file contents and seperate both  
            for(int j = 1; j < values.length; j++){
                
                //Split filename and content
                String[] name_cont = values[j].split("\\(");
                
                //Remove the ")"
                name_cont[1] = name_cont[1].replace(")","");
                
                //Now we will put key=content, value=filename to map
                List<String> filenames = res.getOrDefault(name_cont[1],new ArrayList<String>());
                
                //adding= root/a/1.txt
                filenames.add(values[0] + "/" + name_cont[0]);
                
                //(abcd, (root/a/1.txt, root/c/3.txt);
                res.put(name_cont[1], filenames);
                
            }
        }
        
        //Stores the list of all the duplicate files into list (contents having atleast 2 files)
        List<List<String>> duplicateFiles = new ArrayList<>();
        
        for(String content : res.keySet()){
            
            //If a content is written in more than 1 file
            if(res.get(content).size() >= 2)
                duplicateFiles.add(res.get(content));
                
        }
        
        return duplicateFiles; 
        
    }
}
