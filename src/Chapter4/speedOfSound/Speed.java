package speedOfSound;

public class Speed {
private double distance;

public Speed(double d)
{
    distance=d;
}
public void setDistance(double d)
{
    distance=d;
}
public double getDistance()
{
    return distance;
}
public double getSpeedinAir()
{
    double air=distance/1100;
    return air;
}
public double getSpeedinWater()
{
    double water=distance/4900;
    return water;
}
public double getSpeedinSteel()
{
    double steel=distance/16400;
    return steel;
}


}
