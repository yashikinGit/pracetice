public class Test3 {
    public static void main(String[] args){
        Rectangle myRect = new Rectangle();
        myRect.setX(10);
        myRect.setY(20);
        myRect.setWidth(20);
        myRect.setHeight(10);
        double area = myRect.getArea();
        System.out.println("area = "+area);
    }
}
