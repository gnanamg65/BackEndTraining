<<<<<<< HEAD
package Day13.PalindromString;

public class StringPalindrom {
    public boolean isPalindrom(String str) {
        String str1 = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str1).reverse().toString();
        return str1.equals(reversed);
    }
}
=======
package Day13.PalindromString;

public class StringPalindrom {
    public boolean isPalindrom(String str) {
        String str1 = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str1).reverse().toString();
        return str1.equals(reversed);
    }
}
>>>>>>> 9f4db15e6bd5544983a99aced35c95885731322f
