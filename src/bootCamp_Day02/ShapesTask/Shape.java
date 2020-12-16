package bootCamp_Day02.ShapesTask;

public class Shape {

    public String name;

    public Shape(String name){
        this.name = name;
    }

    public double area;
    public double perimeter;

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
