//Rectangle class
class Rectangle {
    //Create two double variables to store height and width
    double height;
    double width;

    //No-args constructor that creates default rectangle
    Rectangle(){
        height = 1;
        width = 1;
    }

    //Second constructor to get new dimensions
    Rectangle(double newHeight, double newWidth){
        height = newHeight;
        width = newWidth;
    }

    //Method that finds and returns the area of the given rectangle
    double getArea(){
         return width * height;
    }
    //Method that finds and returns the perimeter of the given rectangle.
    double getPerimeter(){
        return (2*(height+width));
     }
}
