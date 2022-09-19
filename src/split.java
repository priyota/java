import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String[] str=new String[]{"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        for (int i=0;i<str.length;i++) {
            String[] words = str[i].split("\\.jpg");
            for(int k=0;k<words.length;k++)
            {
                System.out.println(words[k]);
            }


        }
    }
}
