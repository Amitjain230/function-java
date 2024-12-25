import java.util.Scanner;
class Goverment{
Scanner sc=new Scanner(System.in);
String name;
int empno;
float sal;

void acceptData(){
System.out.println("Enter name:");
name=sc.nextLine();
System.out.println("Enter Employ number:");
empno=sc.nextInt();
System.out.println("Enter Salary:");
sal=sc.nextFloat();
}

void showData(){
System.out.println("Name:"+name);
System.out.println("Employ number:"+empno);
System.out.println("Salary:"+sal);
}

double getHRA(){
float s;
s=sal%0.2F;
return s;
}

double getDA(){
float p;
p=sal%0.2F;
return p;

}

double getTA(){
float d;
d=sal%0.1F;
return d;
}

double grossSalary(){
double g=sal+getHRA()+getDA()+getTA();
return g;
}

double in(){
double k=getHRA()+getDA()+getTA();
return k;
}
public static void main(String args[]){
Goverment c=new Goverment();
c.acceptData();
c.showData();
c.getHRA();
c.getDA();
c.getTA();
c.grossSalary();
c.in();


}
}