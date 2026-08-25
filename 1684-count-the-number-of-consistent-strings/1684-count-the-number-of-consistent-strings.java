class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        boolean found =false;
        for(int i=0;i<words.length;i++){
            String b=words[i];
            for(int j=0;j<b.length();j++){
                 if(allowed.indexOf(b.charAt(j))!=-1) found=true;
                 else {
                    found=false;
                    break;
                    }
                    
            }
            if(found)count++;
        }
        return count;

    }
}