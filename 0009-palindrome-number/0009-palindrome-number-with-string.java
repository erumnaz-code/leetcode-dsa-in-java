// String Reversal: Time O(n²), Space O(n)

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        else if(x == 0){
            return true;
        }

        String orig = String.valueOf(x);
        String rev = "";

        while (x > 0) {
            int digit = x % 10;
            rev = rev + digit;
            x = x / 10;
        }

        if (orig.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}



