public class vowel_count {
    public static void main(String[] args) {
        String str = "roadtosdet";
        int length = str.length();
        System.out.println(length);

        int n = 0;
        for (int i = 0; i <length; i++) {
            if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')){
            n=n+1;
            }
        }
        System.out.println(n);
    }
}