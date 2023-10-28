
public class S2_17_110360121
{
    public static void main(String[] args)
    {
        int[] test;
        test = new int[5];
        test[0]=52;
        test[1]=01;
        test[2]=31;
        test[3]=44;
        test[4]=14;
        
        test[87]=77;
        for(int i=0;i<5;i++)
            System.out.println("the"+i+"person's grade is "+test[i]);
    }
}