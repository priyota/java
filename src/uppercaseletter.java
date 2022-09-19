public class uppercaseletter {
    public static void main(String[] args) {
        String str="i love my java";
        char[] msg= str.toCharArray();
        Boolean foundspace=true;
        for(int i=0;i<msg.length;i++)g
        {
            if(Character.isLetter((msg[i])))
            {
                if(foundspace==true)
                {
                    msg[i]=Character.toUpperCase(msg[i]);
                    foundspace=false;
                }
            }
            else
            {
                foundspace=true;
            }
        }
        String msg2=String.valueOf(msg);
        System.out.println(msg2);

    }
}
