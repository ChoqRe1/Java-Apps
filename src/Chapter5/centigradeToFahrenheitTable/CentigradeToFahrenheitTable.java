package Chapter5.centigradeToFahrenheitTable;

/**
 * Chapter5.centigradeToFahrenheitTable created by Remi on 2016-11-09.
 */
//1530001
public class CentigradeToFahrenheitTable {
    public static void main(String[] args){
        double fahrenheit;
        double celcius;

        System.out.println("Centigrade to Fahrenheit Table\nC:       F:");
        for(int i=0; 20>=i; i++){
            celcius = i;
            fahrenheit = 9.0/5*(celcius)+32;
            System.out.println(i + "       " + fahrenheit);
        }
    }

}
