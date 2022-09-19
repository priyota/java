public class homework {
    public static void main(String[] args) {
        String str="bangladesh";
        String firstletter=String.valueOf(str.charAt(0)).toUpperCase();
        char[] ch=str.toCharArray();
        String lastletter=String.valueOf(str.charAt(ch.length-1)).toUpperCase();
        int length=ch.length-2;
        System.out.println(firstletter+length+lastletter);

    }
}
