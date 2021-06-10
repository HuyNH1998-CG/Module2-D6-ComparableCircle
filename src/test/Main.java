package test;
import java.util.Comparator;
import java.util.Arrays;
import circle.Circle;
import circle.CircleComparator;
public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(5);
        circles[2] = new Circle(8,"black",false);
        System.out.println("Pre-sorted");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
