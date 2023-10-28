
public class S2_22_110360121
{
    public static void main(String[] args)
    {
        int [][] test;
        test = new int[2][5];
        
        test[0][0]=80;
        test[0][1]=60;
        test[0][2]=22;
        test[0][3]=50;
        test[0][4]=75;
        test[1][0]=90;
        test[1][1]=55;
        test[1][2]=68;
        test[1][3]=72;

        
        for(int i=0;i<test[1].length;i++){
            System.out.println("the " +(i+1)+ " person's chinese grade is " +test[0][i]);
            System.out.println("the " +(i+1)+ " person's math grade is " +test[1][i]);
        }
    }
}