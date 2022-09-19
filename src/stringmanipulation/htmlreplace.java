package stringmanipulation;

public class htmlreplace {
    public static void main(String[] args) {
        String str="Your trnx is successful. Trnx Id is: TXN123456";
        String replacestr=str.replaceAll("[^TXN\\d]"," ");
        System.out.println(replacestr);

    }
}
