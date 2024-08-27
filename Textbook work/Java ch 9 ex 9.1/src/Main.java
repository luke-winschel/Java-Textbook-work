//(The Rectangle Class)  Design a class named Rectangle to represent a rectangle. Display the width, height, area, and perimeter of each rectangle.
//Main Class
public class Main {
    public static void main(String[] args) {
        //Create first rectangle variable and pass the height and width.
        Rectangle rectangle1 = new Rectangle(4,40);
        //Return the first rectangle's height, width, area, and perimeter.
        System.out.println("The are of a rectangle that has a height of: " + rectangle1.height + " and a width of: " + rectangle1.width + " has an area of: " + rectangle1.getArea() +
                " and a perimeter of: " + rectangle1.getPerimeter());

        System.out.println();

        //Create second rectangle variable and pass the height and width.
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        //Return the second rectangle's height, width, area, and perimeter.
        System.out.println("The are of a rectangle that has a height of: " + rectangle2.height + " and a width of: " + rectangle2.width + " has an area of: " + rectangle2.getArea() +
                " and a perimeter of: " + rectangle2.getPerimeter());
    }
}