package december.programs;


public class DivisorsofGivenNumber {

    public static void main(String[] args)
    {
        DivisorsofGivenNumber obj = new DivisorsofGivenNumber();
        obj.divisorsof_given_number(120);

    }

    void divisorsof_given_number(int no)
    {
        int i = 2;
        int count=0;
        System.out.print(1+" ");
        while(i<=no/2)
        {
            if(120%i == 0)
            {
                System.out.print(i+" ");
                count=count+1;

            }
            i = i+1;
        }
        System.out.print(120);
        System.out.println();
        System.out.println("Count of Divisors of Given Number is "+ count+2);
    }
}
