import java.util.Queue;

public class jpg {
    public static void main(String[] args) {
        String[] str=new String[]{"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int length=str.length;
        int n=0;
        String str2="jpg";
        String str3="png";
        System.out.println(length);
        for(int i=0;i<length;i++)
        {
            String[] words=str[i].split("\\.");

            System.out.println(words[words.length-2]);
            System.out.println(words[words.length-1]);
            if((words[words.length-1].equals(str2))||(words[words.length-1].equals(str3)))
            {
                n=n+1;

            }


        }
        System.out.println("total jpg images  are  "+n);
    }
}
