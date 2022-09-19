public class chattogram {
    public static void main(String[] args) {
        String str = "chattagram";
        char[] arr = str.toCharArray();
        String s1=String.valueOf(str.charAt(0)).toUpperCase();
        int length=str.length();
        System.out.println(s1);
        System.out.println(length);
        String s2=String.valueOf(str.charAt(length-1)).toUpperCase();
        System.out.println(s2);

        int length2=length-2;
        System.out.println(s1+length2+s2);

    }

}
