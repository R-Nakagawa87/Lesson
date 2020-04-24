
public class FizzBuzz {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			showFizzBuzz(i) ;
			}
		}

	public static void showFizzBuzz(int num) {
		if( num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}else if( num%5==0 ) {
			System.out.println("Buzz");
		}else if(num%3==0){
			System.out.println("Fizz");
		}else {
		System.out.println(num);
		}
	}

	}

