import geometry.Point;
import geometry.Line;
import geometry.Rectangle;

public class GeometryDemo {
    public static void main(String[] args) {
        System.out.println("ДЕМО ПОДКЛЮЧЕНИЯ JAR БИБЛИОТЕКИ");

        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 10);
        Point p3 = new Point(5, 5);

        Line line = new Line(p1, p2);
        Rectangle rect = new Rectangle(p3, 8, 6);
        Rectangle rect2 = new Rectangle(new Point(2, 2), 4, 3);

        System.out.println("Созданные фигуры:");
        System.out.println("Точка 1: " + p1);
        System.out.println("Точка 2: " + p2);
        System.out.println("Линия: " + line);
        System.out.println("Длина линии: " + line.length());
        System.out.println("Прямоугольник 1: " + rect);
        System.out.println("Площадь прямоугольника: " + rect.area());


        System.out.println("Проверка пересечений:");
        System.out.println("rect1 пересекается с rect2: " + rect.intersects(rect2));



        System.out.println("Перемещение объектов:");
        System.out.println("До перемещения: " + rect);
        rect.move(3, 2);
        System.out.println("После перемещения: " + rect);

        System.out.println("JAR библиотека успешно подключена и работает!");
    }
}