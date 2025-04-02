class Solution {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int original = x;
    int reversed = 0;

    while (x > 0) {
        int lastdigit = x % 10;
      reversed = reversed * 10 + lastdigit;
      x /= 10;
    }

    return original == reversed;
  }

 
}