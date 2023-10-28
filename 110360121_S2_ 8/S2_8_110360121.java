import java.io.*;
public class S2_8_110360121
{
    public static void main(String[] args) throws IOException
    {
        int i=1;
        while(i==1){
            System.out.println("which path should I choose");
            System.out.println("input an int");
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
                
            String str = br.readLine();
            int res=Integer.parseInt(str);

            char ans = (res==1)?'A':'B';
            
            System.out.println("chose "+ ans +" path");
        }    
    }
}