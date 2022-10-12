package leetcode_stuff;

public class palindrome {
    int num = 121;
    public boolean isPalindrome(int num){
        if(num < 0) return  false; 
        int reversed = 0, remainder, original = num;
        
        while(num != 0) {
             remainder = num % 10; // reversed integer is stored in variable
             reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
             num  /= 10;  //the last digit is removed from num after division by 10.
         }

         // palindrome if original and reversed are equal
         return original == reversed;
     }
}
