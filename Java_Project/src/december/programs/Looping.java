package december.programs;

public class Looping {

    public static void main(String[] args)
    {

        Looping loopingObj = new Looping();
        loopingObj.printEvenNumbers(20,false);
        System.out.println();
        loopingObj.printThreeMultiples(30);
        System.out.println();
        loopingObj.printEvenNumbers(20,true);
    }

    void printEvenNumbers (int maxNo,boolean withZero)
    {

        int i = withZero==true?0:2;
        while(i<=maxNo)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            i = i+1;
        }
    }

    void printThreeMultiples(int maxNo)
    {
        int i = 3;
        while(i<=maxNo)
        {
            System.out.print(i+" ");
            i = i+3;
        }

    }

}
