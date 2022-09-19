public class replaceword{
    public static void main(String[] args) {
        String str="Ratul and Rahim lives in Rangpur";
        int length=str.length();
        System.out.println(length);
        String str3=str.substring(0,10);
        System.out.println(str3);


        String str4=str.substring(11,length);
        System.out.println(str4);
        String[] words=str.split(" ");
       String str2=(String.valueOf(words[2].charAt(0))).replace("R","F");

        System.out.println(str3+str2+str4);
    }
}
