package december.programs;

public class Multiplesof3and5 {

    public static void main(String[] args) {

            Multiplesof3and5 obj = new Multiplesof3and5();
            obj.multiplesOf_3_and_5(30);
            System.out.println();;
            obj.multiplesOf_3_or_5(30);

    }

    void multiplesOf_3_and_5(int maxLimit)
    {
        int i = 3;
        while (i <= maxLimit) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i+" ");
            }
            i = i + 1;

        }
    }

    void multiplesOf_3_or_5(int maxLimit)
    {
        int i = 3;
        while (i <= maxLimit) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i+" ");
            }
            i = i + 1;

        }
    }
}
