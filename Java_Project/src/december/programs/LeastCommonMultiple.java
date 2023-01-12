package december.programs;

public class LeastCommonMultiple {

    public static void main(String[] args)
    {

        LeastCommonMultiple obj = new LeastCommonMultiple();
        obj.least_common_multiple(3,1000);
    }

    void least_common_multiple(int no1, int no2)
    {
        int i = no1>no2?no1:no2;
        while(true)
        {
            if(i%no1 ==0 && i%no2==0)
            {
                System.out.print(i);
                break;
            }
            i=i+1;
        }

    }
}

