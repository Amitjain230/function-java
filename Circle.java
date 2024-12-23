import java.util.Scanner;
class Circle{
float r;
void acceptData(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of circle :");
r=sc.nextFloat();

}
void showData(){
System.out.println("Radius is :"+r);

}

void getArea(){
System.out.println("Area :"+(3.14*r*r));

}

void getCircumference(){
System.out.println("Circumference is :"+(2*3.14*r));

}
public static void main(String args[]){
Circle r=new Circle();
r.acceptData();
r.showData();
r.getArea();
r.getCircumference();
}

}