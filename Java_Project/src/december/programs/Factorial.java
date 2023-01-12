package december.programs;

public class Factorial {

    public static void main(String[] args)
    {
        Factorial obj = new Factorial();
        obj.factorial(5);
    }

    void factorial(int no)
    {
        int i = 1;
        int multiple = 1;
        while(i<=no)
        {
            multiple = multiple*i;
            i = i+1;
        }
        System.out.print(multiple);


    }
}
