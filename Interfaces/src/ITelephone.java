/**
 * Created by kritisharma on 2/16/20.
 */

public interface ITelephone //interface naming convention with I in front
{
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}

