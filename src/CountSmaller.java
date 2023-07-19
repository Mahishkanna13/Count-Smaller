import java.util.Scanner;

public class CountSmaller {
    public static int[] Count(int[] Array)
    {
        int count=0;
        int[] Result=new int[Array.length];
        for(int i=0;i<Array.length-1;i++)
        {
            for(int j=i+1;j<Array.length;j++)
            {
                if(Array[i]>Array[j])
                {
                    count++;
                }
            }
            Result[i]=count;
            count=0;
        }
        return Result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Size=scanner.nextInt();
        int[] Array=new int[Size];
        for (int i=0;i< Size;i++)
        {
            Array[i]= scanner.nextInt();
        }
        int output[]=Count(Array);
        for (int i=0;i< output.length;i++)
        {
            System.out.println(output[i]);
        }
    }
}
