import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DisplayNoOfCharWordLine {
	public static void main(String args[])
	{
		int charCount = 0;
        int wordCount = 0;
        int lineCount=0;
        int i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the TEXT : ");
        String str = obj.nextLine();
         
         char ch[]=str.toCharArray();
            for( i=0;i<ch.length;i++)
               if(ch[i]=='.')
               lineCount++;
                   
                String[] words = str.split(" ");
                wordCount = wordCount + words.length;
                 
                for (String character : words)
                {
                    charCount = charCount + character.length();
                }
               
            System.out.println("Number of character in the Text: "+charCount);
            System.out.println("Number of words in the Text: "+wordCount);
             System.out.println("Number of lines in the Text: "+lineCount);
	}
}