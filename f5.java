import java.util.Scanner;
class f5{
	int fact(int n){
		if(n==1){
		return 1;
}
		else{
		return n*fact(n-1);
}
	}
	public static void main(String args[]){
	f5 x=new f5();
	System.out.println(x.fact(5));
}
}
	