public class pricevat {
    public static void main(String[] args) {
        String str="the price of the shirt is 500 tk and the vat is 75 tk";
        str=str.replaceAll("[^\\d]"," ");
        System.out.println(str);
        str=str.trim();
        System.out.println(str);
        str=str.replaceAll(" +"," ");
        System.out.println(str);
        String[] arr=str.split( " ");
        double shirt_price=Double.parseDouble(arr[0]);
        double vat=Double.parseDouble(arr[1]);
        double total=shirt_price+vat;
        System.out.println("total price "+total);
    }
}
