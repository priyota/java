package stringmanipulation;

public class reversestring {
    public static void main(String[] args) {
        String str="NRIPTA";
        reverseString(str);
    }
    public static void reverseString(String str)
    {
        char ch[]=str.toCharArray();
        String rev=" ";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev+=ch[i];
        }
        System.out.println(rev);
    }
}
