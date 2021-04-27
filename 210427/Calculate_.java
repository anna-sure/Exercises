
public class Calculate_ {
	public static void main(String[] args) {

		Cale c1 = new Cale(10, 20);
		System.out.println(c1.sum());
		System.out.println(c1.minus());
		System.out.println(c1.multiplication());

		double res = c1.division();
		if (res != null) {
			System.out.println(c1.division());
		}

	}

	class Cale {
		double n1;
		double n2;

		public Cale(double n1, double n2) {
			this.n1 = n1;
			this.n2 = n2;
		}

		public double sum() {
			return n1 + n2;
		}

		public double minus() {
			return n1 - n2;
		}

		public double multiplication() {
			return n1 * n2;
		}

		public Double division() {
			if (n2 == 0) {
				System.out.println("分母不能为0");
				return null; // 必须在包装类才可以使用，so将方法定义成包装类
			} else {
				return n1 / n2;
			}
		}

	}
}