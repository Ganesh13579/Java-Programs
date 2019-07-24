package arrays;

public class BoubleSort {

	public static void main(String[] args) {
		BoubleSort b = new BoubleSort();
		int a[] = { 22, 10, 15, 9, 8 };
		int c[] = sort(a);
		b.print(c);
	}

	public static int[] sort(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
