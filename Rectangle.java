public class Rectangle {
    private int x;
    private int y;
    private int w;
    private int h;

    public void setX(int xnew){
        x=xnew;
    }

    public void setY(int ynew){
        y=ynew;
    }

    public void setWidth(int wnew){
        w=wnew;
    }

    public void setHeight(int hnew){
        h=hnew;
    }

    public double getArea(){
        return w*h;
    }
}
