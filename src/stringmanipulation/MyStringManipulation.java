package stringmanipulation;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class MyStringManipulation {
    public static void main(String[] args) {
        String str = "i live in Dhaka";
        String city = "Dhaka";
        String citytwo = "Dhaka";
        char[] a = str.toCharArray();
        System.out.println(a[0]);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println(a.length);
        System.out.println(str.length());
        char c = str.charAt(0);
        System.out.println(c);

        String d = String.valueOf(str.charAt(0));

        System.out.println(str.indexOf('i'));
        System.out.println(str.contains(city));


        System.out.println(city.contains(str));
        System.out.println(city.equals(citytwo));
        System.out.println(str.replace("Dhaka", "Rajshahi"));
        System.out.println(str.concat("hello"));
        String[] words = str.split(" ");
        System.out.println(words.length);
        for (int j = 0; j < words.length; j++)
        {
            System.out.println(words[j]);
        }
        System.out.println(words.length);
        System.out.println(str.substring(10, 15));
        String str2="dhaka";
        String s1=String.valueOf(str2.charAt(0)).toUpperCase();
        System.out.println("first uppercase letter"+s1);
        String s2=str2.substring(1).toUpperCase();
        System.out.println(s2);
        System.out.println(s1+s2);
        String str3=" rajshahi ";
        System.out.println(str3.trim());
        String amount="100.50";
        String[] amt=amount.split("\\.");
        String t1=amt[0];
        String p1=amt[1];
        int t=Integer.parseInt(t1);
        int p= Integer.parseInt(p1);
        System.out.println(t*2);
        System.out.println(p);
        String path="D:\\java\\practice1\\java";
        String project_name[]=path.split("\\\\");
        System.out.println(project_name[3]);
    }

}



