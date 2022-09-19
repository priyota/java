public class shareeshirtprice {
    public static void main(String[] args) {
        int shirt_price=1200;
        int sharee_price=3500;
        int shirt_no=2;
        int sharee_no=1;
        if((shirt_no==2)&(sharee_no==1))
        {
            int total_price=(((shirt_price*shirt_no)+(sharee_price*sharee_no))-400);
            System.out.println(total_price);

        }
    }
}
