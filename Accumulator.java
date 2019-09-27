public class Accumulator {
	private Number sum;

	public Accumulator(Number sum) {
		this.sum = sum;
	}

	public Number apply(Number value) {
		return (longable(sum) && longable(value)) ? 
			(sum = sum.longValue() + value.longValue()) :
			(sum = sum.doubleValue() + value.doubleValue());
	}

	private static boolean longable(Number number) {
		return number instanceof Byte || number instanceof Short ||
			number instanceof Integer || number instanceof Long;
	}

	public static void main(String[] args) {
		Accumulator acc = new Accumulator(0);
		acc.apply(3);
		System.out.println(acc.apply(7));
	}
}
