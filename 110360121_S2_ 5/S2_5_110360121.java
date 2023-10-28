import java.io.*;
public class S2_5_110360121
{
    public static void main(String[] args) throws IOException
    {
        int i=1;
        while(i==1){
            System.out.println("please input an integer");
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            switch(num)
            {
                case 1:
                {
                     System.out.println("the input is 1");
                     break;
                }
                case 2:
                {
                     System.out.println("the input is 2");
                     break;
                }
                default:
                {
                     System.out.println("please input 1 or 2");
                }
            }
        }    
    }
}