package pizzaproblem;

public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

public Pizza(String size, int cheese, int pepperoni, int ham){
    this.size="";
    this.cheese=0;
    this.pepperoni=0;
    this.ham=0;
}
public void setSize(String size){
    this.size=size;
}
public void setCheese(int cheese)
{
    this.cheese=cheese;
}
public void setPepperoni(int pepperoni)
{
    this.pepperoni=pepperoni;
}public void setHam(int ham)
{
    this.ham=ham;
}
public int getCheese()
{
    return cheese;
}
public int getPeperonni()
{
    return pepperoni;
}
public int getHam()
{
    return ham;
}


}