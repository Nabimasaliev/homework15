public class Circle {
    private  double pi;
    private int radius;

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static String area(double pi){
        return "Area=";
    }
    public static String  circumference(double pi){
       return "Circumference=" ;
    }
}
