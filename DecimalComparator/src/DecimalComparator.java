/**
 * Created by kritisharma on 7/31/19.
 */
public class DecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces(double firstnumber, double secondnumber)
    {
        if (((int)(firstnumber * 1000)) == ((int)(secondnumber * 1000)))
        {
            System.out.println("Yes, the numbers are equal.");
            return true;
        }
        else
        {
            System.out.println("No, the numbers aren't equal.");
            return false;
        }
    }
}
