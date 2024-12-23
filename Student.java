import java.util.Scanner;
class Student{
String Name;
String Enroll;
int P,M,E,H,C;
void getData(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of student :");
Name=sc.nextLine();
System.out.println("Enter Enrollment of student :");
Enroll=sc.nextLine();
System.out.println("Enter Enrollment of student :");
System.out.println("Enter Physics marks :");
P=sc.nextInt();
System.out.println("Enter Maths marks :");
M=sc.nextInt();
System.out.println("Enter Chemistry marks :");
C=sc.nextInt();
System.out.println("Enter Hindi marks :");
H=sc.nextInt();
System.out.println("Enter English marks :");
E=sc.nextInt();


}
void showData(){
System.out.println("Name"+Name);
System.out.println("Enrollment"+Enroll);
System.out.println("Physics marks :"+P);
System.out.println("Maths mark"+M);
System.out.println("Chemistry marks"+C);
System.out.println("Hindi marks"+H);
System.out.println("English marks"+E);
}

int tot(){
int sum=P+M+C+E+H;
return sum;
}
float perc(int tot){
float perc=tot/5;
return perc;
}

public static void main(String args[]){
Student r=new Student();
r.getData();
r.showData();
int tm=r.tot();
System.out.println("Total marks :"+tm);
float p=r.perc(tm);
System.out.println("Percentage :"+p);
}
}
