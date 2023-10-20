package assign14q7;

import java.util.Random;
import java.util.stream.Stream;

public class Program7 {

	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() ->r.nextInt(10)).limit(10);
		
		int result = strm.reduce(1, (a,x)-> a+x);
		System.out.println("The addition of 10 random numbers is :"+ result);
	}

}
