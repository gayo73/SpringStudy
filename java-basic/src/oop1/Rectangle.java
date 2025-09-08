package oop1;

public class Rectangle {
    int width;
    int height;
    int area = calculateArea(width, height);
    int perimeter = calculatePerimeter(width, height);
    boolean square = isSquare(width, height);

    int calculateArea(int width, int height) {
        return width * height;
    }
    int calculatePerimeter(int width, int height) {
        return 2*(width * height);
    }
    boolean isSquare(int width, int height) {
        return width == height;
    }
}
