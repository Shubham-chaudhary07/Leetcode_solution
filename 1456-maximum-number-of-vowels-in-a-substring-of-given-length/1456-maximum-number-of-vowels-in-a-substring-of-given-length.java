class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int vowels_count=0;
        for(int i=0;i<k;i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                vowels_count++;
            }
        }
        int max_vowel_count=vowels_count;
        for(int i=k;i<n;i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                vowels_count++;
            }
            ch =s.charAt(i-k);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                vowels_count--;
            }
            max_vowel_count=Math.max(max_vowel_count,vowels_count);

        }
        return max_vowel_count;
    }
}