import java.util.Scanner;
class Rectangle{
int l;
int b;
void acceptData(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length :");
l=sc.nextInt();
System.out.println("Enter the breadth :");
b=sc.nextInt();

}
void showData(){
System.out.println("Length is :"+l);
System.out.println("breadth is :"+b);
}

void getArea(){
System.out.println("Arae :"+(l*b));

}

void getParameter(){
System.out.println("Parameter is :"+2*(l+b));

}
public static void main(String args[]){
Rectangle r=new Rectangle();
r.acceptData();
r.showData();
r.getArea();
r.getParameter();
}

}