package Chapter4.energy;

public class energy {
private double calories;
private double fat;
private double fatcal=0;
private double percentage=0;

public energy(double c,double f)
{
    calories=c;
    fat=f;
}
public double getPercentage()
{
fatcal=fat*9;
if(fatcal>calories)
{
    System.out.println("Error!!! thoose numbers are invalid");
}
else if(percentage<30)
{
    System.out.println("Hey guess what, this food is low in fat");
    percentage=fatcal/calories;
    
}
return percentage;
}
}
