class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int minLen = Math.min(len1, len2);
        for(int i = 0; i < minLen; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return "";
            }
        }

        if(len1 < len2){
            if(str2.startsWith(str1)){
                return gcdOfStrings(str2.substring(minLen), str1);
            }
        } else if(len2 < len1){
            if(str1.startsWith(str2)){
                return gcdOfStrings(str1.substring(minLen), str2);
            }
        } else {
            return str1;
        }

        return "";

    }

}
