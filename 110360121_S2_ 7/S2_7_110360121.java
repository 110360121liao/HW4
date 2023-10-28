import java.io.*;
public class S2_7_110360121
{
    public static void main(String[] args) throws IOException
    {
        int i=1;
        while(i==1){
            System.out.println("are you a boy?");
            System.out.println("input Y N");
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            char letter =str.charAt(0);
            if(letter=='Y' || letter=='y')
            {
                System.out.println("U R a Boy");
            }
            else if(letter=='N' || letter=='n')
            {
                System.out.println("U R a girl");
            }else
            {
                System.out.println("U a battle helicopter");
            }
        }    
    }
}