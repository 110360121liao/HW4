import java.io.*;
public class S2_15_110360121
{
    public static void main(String[] args) throws IOException
    {
        int [] test;
        test = new int[5];
        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;
        for(int i=0;i<5;i++)
            System.out.println("The "+(i+1)+" person's grade is "+ test[i]);
    }
}