public class Triangle extends Shape {
    private double side1=1.0, side2=1.0, side3= 1.0;
    public Triangle(){
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        double perimeter= (side1+side2+side3);
        return perimeter;
    }
    public double getArea(){
        double p= (getPerimeter()/2);
        double area= (float) (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
        return area;
    }

    public void checkTypeTriangle(){
        double a= getSide1();
        double b= getSide2();
        double c= getSide3();

        if (a>=(b+c)||b>=(a+c)||c>=(a+b)){
            System.out.println("Ko phải là tam giác");
        }else if(a==b&&a==c){
            System.out.println("Là tam giác đều ");
        } else if((a == b && (a * a + b * b == c * c))
                || (a == c && (a * a + c * c == b * b))
                || (b == c && (b * b + c * c == a * a))){
             System.out.println("Tam giác vuông cân");
        }
        else if ((a * a + b * b == c * c)
                || (a * a + c * c == b * b)
                || (b * b + c * c == a * a))
                 System.out.println("Tam giác vuông");
        else if ((a == b)
                || (a == c )
                || (b == c)) {
            System.out.println("Tam giác cân");
        } else System.out.println("Tam giác thường");
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                 super.toString()+
                ", permiter= "+ getPerimeter()+
                ", area= "+ getArea()+
                '}';
    }
}
