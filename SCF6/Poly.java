/*Program to perform various polynomial operation
 * @author Prakhar Golania
 * */
public class Poly {
	private final int polyArray[][];
	
	/*To initialize the private poly Array
	 * */
	Poly(int[][] arr){
		if ( arr.length == 0 )
			throw new AssertionError();
		polyArray = arr.clone();
	}
	
	/*To get the copy of Poly array
	 * @retuen copy to Poly aaray
	 * */
	public int[][] getPolyArray() {
		return polyArray.clone();
	}

	/*To sort the Poly array according to the power
	 * @param 2D array contains polynomial record
	 * @return sorted array arr
	 * */
	private int[][] sorting(int[][] arr){
		int swapDegree, swapCoff, len=arr.length;
		for ( int i=0; i<len-1; i++ )
			for ( int j=0; j<len-1; j++ )
				if ( arr[j][1] < arr[j+1][1] ){
					swapCoff = arr[j+1][0];
					arr[j+1][0] = arr[j][0];
					arr[j][0] = swapCoff;
					swapDegree = arr[j+1][1];
					arr[j+1][1] = arr[j][1];
					arr[j][1] = swapDegree;
				}
		return arr;
	}
	
	/*To add the two polynomial
	 * @param two(class) Poly type object
	 * @return Add polynomial array as addPoly
	 * */
	public int evaluate(float num){
		float totalSum=0;
		for ( int i=0; i<polyArray.length; i++ )
			totalSum += polyArray[i][0]*Math.pow(num,polyArray[i][1]);
		return (int)totalSum;
	}
	
	/*To get the degree of polynomial
	 * return the degree of polynomial
	 * */
	public int degree(){
		int[][] arr = sorting(this.polyArray);
		return arr[0][1];
	}
	
	public boolean addPoly(Poly obj1, Poly obj2){
		int arr1[][] = sorting(obj1.polyArray), i=0, j=0, k=0;
		int[][] arr2 = sorting(obj2.polyArray);
		int addArray[][] = new int[arr1.length+arr2.length][2];
		
		while( i < arr1.length && j < arr2.length){
				if ( arr1[i][1] == arr2[j][1] ){
					addArray[k][0] = arr1[i][0] + arr2[j][0];
					addArray[k][1] = arr1[i][1];
					i++;k++;j++;
				}
				else if ( arr1[i][1] > arr2[j][1]){
					addArray[k][0] = arr1[i][0];
					addArray[k][1] = arr1[i][1];
					i++;k++;
				}
				else{
					addArray[k][0] = arr2[j][0];
					addArray[k][1] = arr2[j][1];
					k++;j++;
				}
			}
		
		while ( i < arr1.length ){
			addArray[k][0] = arr1[i][0];
			addArray[k][1] = arr1[i][1];
			k++;i++;
		}
		while( j < arr2.length ){
			addArray[k][0] = arr2[j][0];
			addArray[k][1] = arr2[j][1];
			j++;k++;
		}
		for ( i=0; i<addArray.length; i++ )
			System.out.println("additon " +addArray[i][0]+addArray[i][1]);
		return true;
}

	/*To multiply the two polynomial
	 * @param two(class) Poly type object
	 * @return multiplied polynomial array as multiPoly
	 * */
	public boolean multiplyPoly(Poly obj1, Poly obj2){
		int arr1[][] = sorting(obj1.polyArray), coff=0, pow=0;
		int[][] arr2 = sorting(obj2.polyArray);
		int size = arr1[0][1]+arr2[0][1];
		int multiArray[][] = new int[size+1][2];
		for(int i=0; i<arr1.length; i++)
			for(int j=0; j<arr2.length; j++)
				{
				coff = arr1[i][0]*arr2[j][0];
				pow = arr1[i][1]+arr2[j][1];
				multiArray[pow][0] += coff;
				multiArray[pow][1] = pow;
				}
		for ( int i=0; i<multiArray.length; i++ )
			System.out.println("multiply " +multiArray[i][0]+multiArray[i][1]);
		return true;
}
}
	
