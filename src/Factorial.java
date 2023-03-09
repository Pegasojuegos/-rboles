
public class Factorial {
	public static void main(String[] args) {
		int num=5;
		System.out.println(factorial(num));
		System.out.println(fibonacci(num,1));
	}
	public static int factorial(int num) {
		int res=0;
		if(num>=2) {
			res=num*factorial(num-1);
		}else {
			if(num<2) {
				res=1;
			}
		}
		return res;
	}
	
	public static int fibonacci(int n,int res) {
		if(n==0)return 0;
		res=res+res-1;
		n--;
		return res+fibonacci(n, res);
		
	}
}
