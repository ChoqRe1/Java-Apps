package Chapter4.date;

/**
 * date created by Remi on 2016-10-12.
 */
public class MagicDate {
    private int day;
    private int mounth;
    private int year;

    public MagicDate(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int fixYear(){
        if (year>=10000){
            year= year-((year/10000)*10000);
        }if (year>=1000){
            year= year-((year/1000)*1000);
        }if (year>=100){
            year= year-((year/100)*100);
        }
        return year;
    }

    public boolean isMagic(){

        return year == mounth*day;
    }

}
