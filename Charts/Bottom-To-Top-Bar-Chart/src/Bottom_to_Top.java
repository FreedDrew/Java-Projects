import java.util.Scanner;
public class Bottom_to_Top {
	public static void main(String args[]) {
		int n;
		int[] numArr = new int[20];
		int max = 0;
		int i;
		int j;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter total number of entries: ");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("Enter value for entry (" + (i + 1) + "):   ");
			numArr[i] = sc.nextInt();
		}
		System.out.print("\n BAR CHART \n\n");
		for (i = 0; i < n; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
		}
		for (i = 0; i < max; i++) {
			for (j = 0; j < n; j++) {
				if (numArr[j] >= max - i) {
					System.out.print(" # ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		for (i = 0; i < n; i++) {
			System.out.print(" " + (i + 1) + " ");
		}
	}
}