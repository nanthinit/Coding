package december.programs;

public class PrimeNumber {

    public static void main(String[] args)
    {
        PrimeNumber obj = new PrimeNumber();
        obj.prime_number_or_not(17);
    }

    void prime_number_or_not(int no)
    {
        int i=2;
        int count = 0;
        while(i<=no/2)
        {
            if(no%i ==0)
            {
                System.out.println("Given Number is not prime");
                count = count+1;
                break;
            }
            i = i+1;
        }
        if (count == 0)
            System.out.println("Given Number is prime");

    }
}
