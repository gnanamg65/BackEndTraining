package Day5.Enum;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
class Enum{
    public static void main(String[] args) {
        Day []day= Day.values();
        for(int i=0;i<day.length;i++){
            if(day[i]==Day.SUNDAY||day[i]==Day.SATURDAY){
                System.out.println(day[i]+" is a weekend");
            }
            else{
                System.out.println(day[i]+" is a weekday");
            }
        }
    }
}