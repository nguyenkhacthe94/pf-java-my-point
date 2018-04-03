public class SetPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint();
        point1.setX(0);
        point1.setY(0);
        double x1 = point1.getX();
        double y1 = point1.getY();

        point2.setX(10);
        point2.setY(30.5);
        double x2 = point2.getX();
        double y2 = point2.getY();

        double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.printf("The distance between 2 point is %.4f", distance);
    }
}
