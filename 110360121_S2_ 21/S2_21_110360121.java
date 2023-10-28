import java.io.*;
import java.lang.reflect.Array;
public class S2_21_110360121
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
            
        System.out.println("please input 5 scores");
        Integer test[] = new Integer[5];
        
        for(int i=0;i<test.length;i++){
            String str = br.readLine();
            test[i]=Integer.parseInt(str);
        }
        Arrays.sort(test,Collections.reverseOrder());
        
        for(int i=0;i<test.length;i++)
            System.out.println("the " +(i+1)+ " place's score is " +test[i]);
    }
}