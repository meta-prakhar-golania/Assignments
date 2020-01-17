/*Program to perform array operation
 * @author Prakhar Golania
 * */
public class ArrOperation {

	/*
	 * Function to find the largest mirror length in array
	 * 
	 * @param a[] is use to get the input array
	 * 
	 * @param n is use to get no. of element in array
	 * 
	 * @return max to return the max. length
	 */
	public int maxMirror(int arr[]) {
		int n = arr.length;
		if (n == 0)
			throw new AssertionError();
		int i, count = 0, temp, max = -1;
		for (i = 0; i < n; i++) {
			count = 0;
			temp = i;
			for (int j = n - 1; j >= 0 && temp < n; j--) {
				if (arr[temp] == arr[j]) {
					count++;
					temp++;
				} else {
					if (max < count) {
						max = count;
					}
					count = 0;
					temp = i + 1;
					if (arr[j] == arr[i])
						count += 1;
				}
			}
			if (max < count) {
				max = count;
			}

		}
		return max;
	}

	/*
	 * Function to find the clumps in array
	 * 
	 * @param a[] is use to get the input array
	 * 
	 * @param n is use to get no. of element in array
	 * 
	 * @return count is use to return the no. of clumps
	 */
	public int clumps(int arr[]) {
		int n = arr.length;
		if (n == 0)
			throw new AssertionError();
		int temp = -1, count = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1] && arr[i] != temp) {
				temp = arr[i];
				count++;
			} else if (arr[i] == arr[i - 1])
				continue;
			else
				temp = -1;
		}
		return count;
	}

	/*
	 * Function to Fix XY problem
	 * 
	 * @param a[] is use to get the input array
	 * 
	 * @param n is use to get no. of element in array
	 * 
	 * @param X and Y is use to get fix values
	 */
	public int[] fixXY(int arr[], int X, int Y) {
		int n = arr.length, countX = 0, countY = 0;
		if (n == 0)
			throw new AssertionError();
		
		if(arr[n-1]==X)
			throw new AssertionError();

		for (int i = 0; i < n; i++) {
			if ((arr[i] == X && arr[i + 1] == X))
				throw new AssertionError();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == X)
				{
				countX++;
				}
			else
			if (arr[i] == Y)
				{
				countY++;
				}
		}
		if (countX != countY)
			throw new AssertionError();
		
		int i, temp;
		for (i = 0; i < n - 1; i++) {
			if (arr[i] == X && arr[i + 1] != Y) {
				for (int j = 1; j < n; j++) {
					if (arr[0] == Y) {
						temp = arr[i + 1];
						arr[i + 1] = arr[0];
						arr[0] = temp;
						break;
					}
					if (arr[j] == Y && arr[j - 1] != X) {
						temp = arr[i + 1];
						arr[i + 1] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		return arr;
	}

	/*
	 * Function to find the split index
	 * 
	 * @param a[] is use to get the input array
	 * 
	 * @param n is use to get no. of element in array
	 * 
	 * @return i is use to return split index
	 */
	public int splitArray(int arr[]) {
		int n = arr.length;
		if (n == 0)
			throw new AssertionError();
		int i, temp1 = 0, temp2 = 0;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < i; j++)
				temp1 = temp1 + arr[j];
			for (int k = i; k < n; k++)
				temp2 = temp2 + arr[k];
			if (temp1 == temp2)
				return i;
			else {
				temp1 = 0;
				temp2 = 0;
			}
		}
		return -1;
	}
}
