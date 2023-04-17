package pages;

public class Program {
    public static void main(String[] args) {
        String str1 = "Hello World";
        StringBuilder sb = new StringBuilder(str1); //перетворили str1  в об'єкт класу StringBuilder
        String str2 = sb.reverse().toString();
        System.out.println(str2);


        System.out.println(isPalindrome("car"));
        System.out.println(isPalindrome("level"));
        System.out.println(isNumberPalindrome(195));
        System.out.println(isNumberPalindrome(202));
    }
    public static boolean isPalindrome(String str1){
        StringBuilder sb1 = new StringBuilder(str1);
        String str2 = sb1.reverse().toString();
        return str1.equals(str2);
    }
    public static boolean isNumberPalindrome(int number){
        String str1 = Integer.toString(number);
        StringBuilder sb2 = new StringBuilder(str1);
        String str2 = sb2.reverse().toString();
        return str2.equals(str1);
    }
}
