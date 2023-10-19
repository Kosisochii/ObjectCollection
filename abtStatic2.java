public class abtStatic2{
	static void m1() {
		System.out.println("from m1");
	};
    static{
        System.out.println("Static block initiated");
    }

	public static void main(String a[]) {
		m1();
	}
};