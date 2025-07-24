
package A250724;

public class ArrayTest {
	
	static int method1(String name) {
		System.out.println(name);
		return 100+30;
	}
	
	public static void main(String[] args) {
		int x = method1("홍길동");
		System.out.println(x);
		
//		int[] arr = new int[] {100, 200, 300, 400};
		int[] arr = {100, 200, 300, 400};
		String names[] = new String[5];
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(names[i]);
			System.out.println(arr[i]);
		}
	}
}
