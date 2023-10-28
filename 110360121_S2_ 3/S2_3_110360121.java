import java.io.*;
public class S2_3_110360121
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("please input an integer");
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num==1)
        {
            System.out.println("the input is 1");
        }
        else
        {
            System.out.println("selection isn't number 1");
        }
    }
}