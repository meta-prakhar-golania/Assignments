package uniqueCharacter;

import java.util.HashMap;

/*@author Prakhar Golania
 * Class find the no. of unique character
 * */
public class UniqueCharacter {

	HashMap<String, Integer> storedString = new HashMap<>();
	
	/*function to calculate no. of unique character
	 * */
	public int uniqueCharInString(String str){
		if(storedString.containsKey(str)){
			System.out.println("Already Exist");
			return storedString.get(str);
		}
		int uniqueChar=0;
		for(int i=0;i<str.length();i++){
			int temp=1;
			for(int j=0;j<i;j++){
				if(str.charAt(i)==str.charAt(j) || str.charAt(i)==' '){
					temp=0;
					break;
				}
			}
			if(temp==1){
				uniqueChar++;
			}
		}
		storedString.put(str, uniqueChar);
		return uniqueChar;
	}
	
	public static void main(String[] args) {
		UniqueCharacter obj = new UniqueCharacter();
		String str[]={"My name is poker","Prakhar","Magie","Mukul"};
		for(int i=0;i<str.length;i++){
			int ans=obj.uniqueCharInString(str[i]);
			System.out.println("The no of unique character in string '"+str[i]+"' is "+ans);	
		}
	}
}
