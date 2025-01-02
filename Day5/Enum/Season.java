package Day5.Enum;

public enum Season {
    WINTER, SPRING, SUMMER, FALL;
    public void getAverageTemprature(){
        switch(this){
            case WINTER:
                System.out.println("Average Temprature is 10 degree");
                break;
            case SPRING:
                System.out.println("Average Temprature is 20 degree");
                break;
            case SUMMER:
                System.out.println("Average Temprature is 30 degree");
                break;
            case FALL:
                System.out.println("Average Temprature is 15 degree");
                break;
        }
    }
}
class Temp{
    public static void main(String[] args) {
        Season s=Season.WINTER;
        s.getAverageTemprature();
        Season s1=Season.SPRING;
        s1.getAverageTemprature();
        Season s2=Season.SUMMER;
        s2.getAverageTemprature();
        Season s3=Season.FALL;
        s3.getAverageTemprature();
    }
}
