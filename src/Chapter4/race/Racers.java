package race;

public class Racers {
private String racer1;
private String racer2;
private String racer3;
private double time1;
private double time2;
private double time3;
private String first="ab";
private String second="bc";
private String third="cd";

public Racers(String r1,String r2,String r3,double t1,double t2,double t3)
{
    racer1=r1;
    racer2=r2;
    racer3=r3;
    time1=t1;
    time2=t2;
    time3=t3;
    getWinner();
}
public void getWinner()
{
    if(time1<time2&&time1<time3)
    {
       first=racer1;
       if(time2<time3)
       {
           second=racer2;
           third=racer3;
       }
       else if(time2>time3)
       {
           second=racer3;
           third=racer2;
       }
    }
    else if(time2<time1&&time2<time3)
    {
       first=racer2;
       if(time1<time3)
       {
           second=racer1;
           third=racer3;
       }
       else if(time1>time3)
       {
           second=racer3;
           third=racer1;
       }
    }
    else if(time3<time2&&time3<time1)
    {
       first=racer3;
       if(time2<time1)
       {
           second=racer2;
           third=racer1;
       }
       else if(time2>time1)
       {
           second=racer1;
           third=racer2;
       }
    }
}
public String getFirst()
{
    return first;
}
public String getSecond()
{
    return second;
}
public String getThird()
{
    return third;
}
}
