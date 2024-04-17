package java_Basics;

public class Operators {

	public static void main(String[] args) {
		// Operators
		int a=3,b=2,c=4;
		System.out.println( a == b);	
		System.out.println(a !=b);
		System.out.println(a >b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println((a+b)<=c);
		System.out.println(a+b+c);
		/*The difference between the two statements lies in the way the expressions are evaluated and concatenated.
		1. **`System.out.println(a+b+c);`**:
		   - In this statement, the values of `a`, `b`, and `c` are added together and then printed.
		   - The addition operation is performed first, and the result is printed as a single value.
		   - For example, if \(a=1\), \(b=2\), and \(c=4\), the output will be **9**.*/
		System.out.println("a+b+c : "+a+b+c);		
		/*2. **`System.out.println("a+b+c : "+a+b+c);`**:
		   - In this statement, the string `"a+b+c : "` is concatenated with the value of `a` (as a string).
		   - Then, the result of the previous concatenation is further concatenated with the value of `b` (as a string).
		   - Finally, the result of the second concatenation is further concatenated with the value of `c` (as a string).
		   - The entire concatenated string is then printed.
		   - For example, if \(a=1\), \(b=2\), and \(c=3\), the output will be **"a+b+c : 123"**.
		Note: The order of operations matters when using concatenation. Parentheses can be used to control the order of evaluation.*/
	}

}
