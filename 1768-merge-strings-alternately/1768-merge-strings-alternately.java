class Solution {
    public String mergeAlternately(String words1, String words2) {
        
        StringBuilder merge=new StringBuilder();
        int i=0;
        int j=0;
        while(i<words1.length() && j<words2.length()){
            merge.append(words1.charAt(i));
            merge.append(words2.charAt(j));
            i++;
            j++;

        }
        if(i<words1.length()){
            merge.append(words1.substring(i));
        }
        if(j<words2.length()){
            merge.append(words2.substring(j));
        }
        return merge.toString();
    }
}