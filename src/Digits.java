import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<>();
        if(num<0)
        {
            throw new IllegalArgumentException("The number passed to the constructor (" +num+ ") cannot be negative!");
        }
        if (num == 0) {
            digitList.add(0);
        }
        else
        {
            int n = num;
            while (n > 0)
            {
                System.out.println(n);
                digitList.add(0, n%10);
                System.out.println(n);
                n /= 10;
                System.out.println(n);
            }
        }
    }


    public boolean isStrictlyIncreasing()
    {
        for(int i=0; i<digitList.size()-1; i++)
        {
            if(digitList.get(i)>=digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> getDigitList()
    {
        return this.digitList;
    }
}
