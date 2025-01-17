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
