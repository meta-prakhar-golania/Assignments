import java.util.ArrayList;

/*Program to perform various set operation
 * @author Prakhar Golania
 * */
public final class IntSet 
	{
	private final int arr[];
	private final int universal=10;
		
	/*For initializing the private array
	 * @param a is used as input array
	 * */
	IntSet(int a[])
		{
		if(a.length==0)
			throw new AssertionError();
		arr = a.clone();
		}
	
	/*For getting the array value(getter) 
	 * */
	public int [] getset()
		{
		return arr.clone();
		}
	
	/*Function to check whether given no. is 
	 * member of set or not
	 * @param x is use to get the no. to be checked
	 * @return true if No. is present else false 
	 * */
	public boolean isMember(int x)
		{
		int n=arr.length;
		for(int i=0;i<n;i++)
			{
			if(arr[i]==x)
				return true;
			}
		return false;
		}
	
	/*Function to return the size of array
	 * @return size as size of aaray
	 * */	
	public int arraySize()
		{
		int size=arr.length;
		return size;
		}	
	
	/*Function to find if given set is subset of the Set
	 * @param obj Intset(class) type object
	 * @return true if subset else false
	 * */
	public boolean isSubset(IntSet obj)
		{
		int[] subset = obj.getset();
		int n2=subset.length;
		for(int i=0;i<n2;i++)
			{
			boolean f= isMember(subset[i]);
			if(f==true)
				continue;
			else 
				return false;
			}
		return true;
		}
	
	/*Function to find the complement of given set
	 * @return complemented array
	 * */
	public IntSet isComplement()
		{
		int complement[]=new int[10],x=0;
		for(int i=1;i<=universal;i++)
			{
			boolean f=isMember(i);
			if(f==false)
				{
				complement[x]=i;
				x++;
				}
			}
		return new IntSet(complement);
		}
	
	/*Function to find the union of two set
	 * @param two intset type of object
	 * @return union array 
	 * */
	public IntSet union(IntSet obj1,IntSet obj2)
		{
		int len1 = obj1.arr.length;
		int len2 = obj2.arr.length;
		ArrayList<Integer> union= new ArrayList<Integer>();
		
		for(int i=0; i<len1; i++)
			union.add(obj1.arr[i]);
		
		for(int j=0; j<len2; j++)
			if( !obj1.isMember(obj2.arr[j]) )
				union.add(obj2.arr[j]);
		
		int unionArray[] = new int[union.size()];
		for(int i=0; i<union.size(); i++)
			unionArray[i] = union.get(i);
		return new IntSet(unionArray);
		} 
	}
	
