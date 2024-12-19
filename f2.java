import java.util.Scanner;
class f2{
	int add(){
	int n1,n2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number1 :");
	n1=sc.nextInt();
	System.out.println("Enter number2 :");
	n2=sc.nextInt();
	int c=n1+n2;
	return c;
}
	public static void main(String args[]){
	f2 obj=new f2();
	int r=obj.add();
	System.out.println("Addition is :"+r);
}
}
	