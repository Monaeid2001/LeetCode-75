class Solution {
    public static String  mergeAlternately(String word1, String word2) {
        StringBuilder sentence = new StringBuilder();
        for(int i=0; i < word1.length() || i < word2.length();i++){
            if(i<word1.length()){
                sentence.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sentence.append(word2.charAt(i));
            }
        }
        return sentence.toString();
    }

    public static void main(String[] args) {
     String word1="abc";
     String word2="defg";
        System.out.println(mergeAlternately(word1,word2));
    }
}
