import java.util.Scanner;
class f3{
	int add(int a,int b){
	
	int c=a+b;
	return c;
}
	public static void main(String args[]){
	f3 obj=new f3();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number1 :");
	int a=sc.nextInt();
	System.out.println("Enter number2 :");
	int b=sc.nextInt();
	
	int r=obj.add(a,b);
	System.out.println("Addition is :"+r);
}
}
	