package Chapter4.daysInAMounth;

public class Month {
private int year;
private int month;
private int m1;
private int m2;
private int m3;
private int days;
private int leap;

public Month(int y, int m)
{
    month=m;
    year=y;
    LeapYear();
    TrueLeap();
}
public void LeapYear()
{
  m1=year%100;
  m2=year%400;
  m3=year%4;
}

public void TrueLeap()
{
    if(m1==0&&m2==0)
    {
        leap=1;
    }
    else if(m3==0)
    {
        leap=1;
    }
    else
    {
        leap=0;
    }
}
public int getDays()
{
    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
    {
        days=31;
    }
    else if(month==4||month==6||month==9||month==11)
    {
        days=30;
    }
    else if(month==2&&leap==1)
    {
        days=29;
    }
    else if(month==2&&leap==0)
    {
        days=28;
    }
    return days;
}

}
