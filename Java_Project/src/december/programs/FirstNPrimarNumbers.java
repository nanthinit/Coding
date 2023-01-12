package december.programs;

public class FirstNPrimarNumbers {

    public static void main(String[] args)
    {

        FirstNPrimarNumbers obj = new FirstNPrimarNumbers();
        obj.first_N_prime_numbers(20);
    }

    void first_N_prime_numbers(int totalCount)
    {
        int no = 2;

        boolean isPrime= true;

        while(totalCount > 0)
        {
            isPrime= true;
            int i = 2;
            while(i<=no/2)
            {
                if(no%i==0)
                {
                    isPrime = false;
                    break;
                }
                i = i+1;
            }

            if (isPrime == true)
            {
                System.out.print(no+" ");
                totalCount=totalCount-1;
            }
            no = no+1;

        }

    }
}
