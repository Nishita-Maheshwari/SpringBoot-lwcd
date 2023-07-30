
public class PairSum {
	
	public static boolean canPairs(int arr[], int n, int k) {
			if (n == 1) {
				return false;
			}

			int l = 0, r = n - 1;
			while (l < r) {
				if (arr[l] + arr[r] != k) {
					return false;
				}
				l++;
				r--;
			}

			return true;
		}

		public static void main(String[] args) {
			int arr[] = {3, 3, 5, 6, 8, 10};
			int k = 10;
			int n = arr.length;
			if (canPairs(arr, n, k)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}