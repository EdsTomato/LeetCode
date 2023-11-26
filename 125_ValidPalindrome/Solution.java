class Solution {
    public boolean isPalindrome(String s) {
        String normalized = s.toLowerCase().replaceAll("[^a-zA-Z0-9]",""); 
        int j = normalized.length()-1;
        for(int i = 0; i<normalized.length()/2; i++){
            if(normalized.charAt(i) != normalized.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}