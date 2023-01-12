package december.programs;

public class SumofFirstnNumbers {

    public static void main(String[] args)
    {
        SumofFirstnNumbers obj = new SumofFirstnNumbers();
        obj.sum_of_first_n_numbers(5);
    }

    void sum_of_first_n_numbers(int no)
    {
        int i = 0;
        int total =0;
        while(i<=no)
        {
            total = total+i;
            i=i+1;
        }
        System.out.print(total);
    }
}
