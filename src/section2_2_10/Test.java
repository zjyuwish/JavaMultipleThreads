package section2_2_10;
//String常量池缓存
public class Test {
	public static void main(String[] args) {
		String a = "a";
		String b = "a";
		System.out.println(a == b);
	}
}
