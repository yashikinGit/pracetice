public class Test2{
   public static void main(String[] args){
        Circle myCircle=new Circle();
        myCircle.setX(10);
        myCircle.setY(20);
        myCircle.setRadius(10);
        double area = myCircle.getArea();
        System.out.println("area = "+area);
    }
}
