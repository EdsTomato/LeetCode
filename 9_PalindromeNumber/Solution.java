class Solution {
    public static boolean isPalindrome(int x) {
		boolean is_palindrome = false;

		int rev_x = 0;
		int temp_x = x;
		while(x > 0){
			rev_x = rev_x * 10 + x % 10;
			x = x / 10;
		}

		if(temp_x == rev_x){
			is_palindrome = true;
		}
		return is_palindrome;
			
	}
}