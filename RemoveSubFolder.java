class RemoveSubFolder {
    public List<String> removeSubfolders(String[] folder) {
        
        //Save all the parent folders
        List<String> parentFolders = new ArrayList<>();
        
        //Sorts all the folders in the array lexicographically, ie the parent folder will always come before child folder as parents size is less.
        Arrays.sort(folder);
        
        //First folder in array will always be a parent
        parentFolders.add(folder[0]);
        
        //We store the parent folder name in prev, useful for checking whether a folder is child or not
        String prev = folder[0];
        
        for(int i=1; i < folder.length; i++){
            
            String curr = folder[i];
            
            //Checking whether the current folder is child or parent
            //Child folder starts with parent folder + /
            if(curr.startsWith(prev) && curr.charAt(prev.length()) == '/')
                continue;
            
            //If parent then we add it to list and store its value in prev for next checkings
            else{
                
                parentFolders.add(curr);
                prev = curr;
                
            }
        }
        
        return parentFolders;
    }
}
