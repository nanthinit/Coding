package december.programs;

public class CommonDivisor {

    public static void main(String[] args)
    {
        CommonDivisor obj = new CommonDivisor();
        obj.print_common_divisior(7,14);
    }

    void print_common_divisior(int no1, int no2)
    {
        int no = no1<no2?no1:no2;
        int i =1;
        int lcd = 0;
        int cdbl = 0;
        int mcd = 0;
        while(i<=no)
        {
            if(no1%i==0 && no2%i==0)
            {
                System.out.print(i+" ");
                if(mcd<=1) {
                    mcd = i;
                }
                cdbl = lcd;
                lcd = i;
            }
            i = i+1;
        }

        System.out.println();
        if(lcd!=0)
            System.out.print("Last Common Divisor is(GCD) "+ lcd);
        System.out.println();
        System.out.print( cdbl==0?lcd:cdbl+ ": Common Divisor before last ");
        System.out.println();
        System.out.print("Minimum Common Divisor is(GCD) "+ mcd);


    }
}
