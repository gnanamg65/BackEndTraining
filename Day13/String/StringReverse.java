<<<<<<< HEAD
package Day13.String;

public class StringReverse {
    public String reverseString(String str) {
    if (str == null) {
        return "Input String cannot be null";
    }
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
}
}
=======
package Day13.String;

public class StringReverse {  public String reverseString(String str) {
    if (str == null) {
        return "Input String cannot be null";
    }
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
}
}
>>>>>>> 9f4db15e6bd5544983a99aced35c95885731322f
