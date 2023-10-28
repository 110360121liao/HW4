import java.io.*;
public class S2_13_110360121
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("what loop to terminate looping?(1~10)");
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        for(int i=0;i<10;i++){
            System.out.println("The "+i+" Process");
            if(i==res) break;
        }
    }
}