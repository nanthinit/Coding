package december.programs;

public class FindPower {

    public static void main(String[] args)
    {

        FindPower obj = new FindPower();
        int powerofGivenNo = obj.find_power(2,5);
        System.out.println(powerofGivenNo);
        System.out.println(Math.pow(2,5));

    }

    int find_power(int no,int power)
    {
        int result=1;
        while(power>0)
        {
            result = result*2;
            power = power-1;
        }
        return result;
    }
}
