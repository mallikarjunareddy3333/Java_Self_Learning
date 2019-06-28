package arjun.prgms.strings;

public class Permutation {

	private void permute(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, i, l);
				permute(str, l + 1, r);
				str = swap(str, i, l);
			}
		}
	}

	private String swap(String str, int i, int j) {
		char[] charr = str.toCharArray();
		char temp = charr[i];
		charr[i] = charr[j];
		charr[j] = temp;
		return String.valueOf(charr);
	}

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);
	}

}
