package week1;

/**
 * Created by Remi on 2016-09-23.
 */
public class widget {
    private double quantity;
    private double time;

    public widget(double q)
    {
        quantity=q;
    }
    public double production()
    {
        time=quantity/160;
        return time;
    }
}
