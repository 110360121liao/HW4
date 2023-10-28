import java.io.*;
public class S2_14_110360121
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("which loop to skip looping?(1~10)");
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        for(int i=0;i<10;i++){
            if(i==res) continue;
            System.out.println("The "+i+" Process");
        }
    }
}