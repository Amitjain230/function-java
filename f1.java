import java.util.Scanner;
class f1{
	void add(int a,int b){
	int c=a+b;
	System.out.println("Addition is:"+c);
}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number1 :");
	int n1=sc.nextInt();
	System.out.println("Enter number2 :");
	int n2=sc.nextInt();
	f1 object=new f1();
	object.add(n1,n2);
}
}
	