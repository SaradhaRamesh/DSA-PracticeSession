import java.util.*;

public class PalindromeArrayFunction {
	public  List<String> findPalindromes(String[] arr) {
        List<String> palindromeList = new ArrayList<>();

        for (String str : arr) {
            if (isPalindrome(str)) {
                palindromeList.add(str);
            }
        }

        return palindromeList;
    }

    public  boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
