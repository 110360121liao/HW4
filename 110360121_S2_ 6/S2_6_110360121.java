import java.io.*;
public class S2_6_110360121
{
    public static void main(String[] args) throws IOException
    {
        int i=1;
        while(i==1){
            System.out.println("please input a or b");
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            char letter =str.charAt(0);
            switch(letter)
            {
                case 'a':
                {
                     System.out.println("the input is a");
                     break;
                }
                case 'b':
                {
                     System.out.println("the input is b");
                     break;
                }
                default:
                {
                     System.out.println("please input a or b");
                }
            }
        }    
    }
}