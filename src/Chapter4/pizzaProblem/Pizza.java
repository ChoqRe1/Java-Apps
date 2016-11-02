package Chapter4.pizzaProblem;
//Created by ChoqRe1
public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;
    private double cost;

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
}
public void setHam(int ham)
{
    this.ham=ham;
}

public String getSize(){
    return size;
}

public int getCheese()
{
    return cheese;
}
public int getPepperoni()
{
    return pepperoni;
}
public int getHam()
{
    return ham;
}

public String getDescription(){
        String description;
    description= "This is your pizza's information:\n" + "Size: " + getSize() +"\nToppings:\n" + "Cheese: " + getCheese() + "\n" + "Pepperoni: " + getPepperoni() + "\n" + "Ham: " + getHam() + "\n"; 
    return description;
}

public double calcCost(){
    if( null != size)switch (size) {
            case "Small":
                cost += 10;
                break;
            case "small":
                cost += 10;
            case "Medium":
                cost += 12;
                break;
            case "medium":
                cost += 12;
                break;
            case "Large":
                cost += 14;
                break;
            case "large":
                cost += 14;
                break;
            default:
                break;
        }
    cost += (2*cheese);
    cost += (2*pepperoni);
    cost += (2*ham);
    return cost;
}
}