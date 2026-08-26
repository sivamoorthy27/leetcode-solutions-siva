class Solution {
    public String clearDigits(String s) {
        String a="";
        boolean []di=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(Character.isDigit(b)){
              for(int j=i-1;j>=0;j--){
                if(Character.isLetter(s.charAt(j))&&di[j]==true){
                    di[j]=false;
                    break;
                }
              }
            }  
            else di[i]=true;
            }
            for(int i=0;i<di.length;i++){
                if(di[i])a+=s.charAt(i);
            }
            return a;
        }
    }
