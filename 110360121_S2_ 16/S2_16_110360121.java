import java.lang.reflect.Array;//no simplifying TAT ;(
public class S2_16_110360121
{
    public static void main(String[] args)
    {
        int[] intArray=(int[]) Array.newInstance(int.class,3);
        Array.set(intArray,0,948);
        Array.set(intArray,1,794);
        Array.set(intArray,2,414);
        
        for(int i=0;i<3;i++)
            System.out.println("intArray["+i+"]="+Array.get(intArray,i));
    }
}