public class Main {
    public static void main(String[] args) {
       Circle circle=new Circle();
       circle.setPi(3.14);
       circle.setRadius(4);

        System.out.println(Circle.area(3.14)+circle.getPi() * (circle.getRadius() * circle.getRadius()));
        System.out.println("-----------------");
        System.out.println(Circle.circumference(3.14)+circle.getPi() * 2 * circle.getRadius());
    }
}