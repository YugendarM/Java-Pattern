public class PatternAsses2 {
    public static void starPattern2()
    {
        int space = 0;
        for(int i=9;i>=1;i=i-2)
        {
            for(int k=0;k<=space;k++)
            {
                System.out.print(" ");
            }
            space++;
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starPattern2();
    }
}
