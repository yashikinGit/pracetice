public class Circle {
    private int x;
    private int y;
    private int radius;

    public void setX(int xnew){
        x=xnew;
    }

    public void setY(int ynew){
        y=ynew;
    }

    public void setRadius(int rnew){
        radius=rnew;
    }

    public double getArea(){
        double area=radius*radius*Math.PI;
        return area;
    }
}
