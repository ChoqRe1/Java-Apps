package Chapter7.rainfall;

/**
 * Chapter7.rainfall created by Remi on 2016-11-16.
 */
public class rain {
    private String[] month = {"Jan","FEV","MAR","APR","MAY","JUI","JULL","AUG","SEPT","OCT","NOV","DEC",};
    private double[] rain = new double[12];
    private double number;
    public rain(double[] ri){
        for(int y =0; y<12; y++){
            rain[y] = ri[y];
        }
    }
    public void total(){
        double sum=0;
        for(int g = 0; g<12; g++){
            sum += rain[g];
        }
        System.out.println(sum);
    }
    public void avg(){
        int sum = 0;
        for(int g = 0; g<12; g++){
            sum += rain[g];
        }
        System.out.println(sum);
        double hh = sum /rain.length;
        System.out.println(hh);
    }
    public void high(){
        double hi = rain[0];
        String mm = month[0];
        for(int r= 0; r<12; r++){
            while(rain[r]>hi){
                hi = rain[r];
                mm = month[r];
            }
        }
        System.out.println("HIGH: "+hi+" in "+ mm);
    }
    public void low(){
        String mo = month[0];
        double lo = rain[0];
        for(int w = 0; w<12; w++){
            while(rain[w]<lo){
                lo = rain[w];
                mo = month[w];
            }
        }
        System.out.println("LOW: "+lo+" in "+mo);
    }
}