package rishabh_61_lab1;

public class Q4 {
	
	public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        
        if (str.equals(rev)) {
            ans = true;
        }
        
        return ans;
    }
	
	public static void main(String[] args) {
		String str = "rraarr";
		
		boolean isP = isPalindrome(str);
		
		System.out.println(isP);
	}
}
