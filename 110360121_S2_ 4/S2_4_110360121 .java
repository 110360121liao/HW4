import java.io.*;
public class S2_4_110360121
{
    public static void main(String[] args) throws IOException
    {
        int i=1;
        while(i==1){
            System.out.println("please input an integer");
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            if(num==1)
            {
                System.out.println("the input is 1");
            }
            else if(num==2)
            {
                System.out.println("the in put is 2");
            }
            else
            {
                System.out.println("please input 1 or 2");
            }
        }    
    }
}