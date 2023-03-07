
public class Factorial {
	public static void main(String[] args) {
		int num=6;
		System.out.println(factorial(num));
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
}
