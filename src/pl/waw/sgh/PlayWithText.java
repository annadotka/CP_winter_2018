package pl.waw.sgh;

public class PlayWithText {
    public static void main(String[] args) {
        String s = "abc";
        String s2 = "def";
        String s3 = s + s2;
        System.out.println(s + s2);
        int sLength = s.length();
        System.out.println(sLength);
        System.out.println(s.indexOf("ab"));
        s.charAt(2);
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2,4));

        String s4 = "ABC";
    }
}
