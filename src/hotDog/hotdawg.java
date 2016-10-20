package pkg278.pkg17;

public class hotdawg {
private int hoomans;
private int eat;
private int consumed;
private int dawgs;
private int breads;
private int dleft;
private int bleft;

public hotdawg(int h,int e)
{
hoomans=h;
eat=e;
consumed=hoomans*eat;
}
public int getDawgs()
{
    if((consumed%10)==0)
    {
        dawgs=consumed/10;
    }
    else
    {
        dawgs=consumed/10+1;
    }
    return dawgs;
}
public int getBreads()
{
    if((consumed/8)==0)
    {
        breads=consumed/8;
    }
    else
    {
        breads=consumed/8+1;
    }  
    return breads;
}
public int getDawgleftovers()
{
    dleft=dawgs*10-consumed;
    return dleft;
}
public int getBreadsleftovers()
{
    bleft=breads*8-consumed;
    return bleft;
}
}
