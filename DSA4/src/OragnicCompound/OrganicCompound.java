package OragnicCompound;

/*@author Prakhar Golania
 * Class to calculate mass of compound
 * */
public class OrganicCompound {
	int massOfCarbon=12;
	int massOfHydrogen=1;
	int massOfOxygen=16;
	int noOfC=0,noOfH=0,noOfO=0;
	
	/*function to calculate no. of C, H , O in compound
	 * */
	public void calculateCompound(String orgComp,int size, int n){
		int C=0,H=0,O=0,i;
		for(i=0;i<orgComp.length();i++){
			if(orgComp.charAt(i)=='C'){
				int value=1;
				if(i!=size-1 && (orgComp.charAt(i+1)>=50 && orgComp.charAt(i+1)<=57)){
						value=orgComp.charAt(i+1)-48;
				}
			C+=value*n;
			}

			if(orgComp.charAt(i)=='H'){
				int value=1;
				if(i!=size-1 && (orgComp.charAt(i+1)>=50 && orgComp.charAt(i+1)<=57)){
					value=orgComp.charAt(i+1)-48;
					}
			H+=value*n;
			}
			
			if(orgComp.charAt(i)=='O'){
				int value=1;
				if(i!=size-1 && (orgComp.charAt(i+1)>=50 && orgComp.charAt(i+1)<=57)){
					value=orgComp.charAt(i+1)-48;
					}
				O+=value*n;
				}
			
			if(orgComp.charAt(i)=='('){
				String subString = new String();
				int j=i+1,value=1;
				while(orgComp.charAt(j)!=')'){
					subString+=orgComp.charAt(j);
					j++;
				}
				if(orgComp.charAt(j+1)>=50 && orgComp.charAt(j+1)<=57){
					value=orgComp.charAt(j+1)-48;
					j++;
				}
				calculateCompound(subString,0,value);
				i=j;
			}
		}
	noOfC+=C;
	noOfH+=H;
	noOfO+=O;
	if(size!=0){
		System.out.println("No of Carbon="+noOfC);
		System.out.println("No. Of Hydrogean= "+noOfH);
		System.out.println("No.Of Oxygen= "+noOfO+"\n\n");
		massOfCompound(noOfC,noOfH,noOfO);
		}
	}
	
	/*function to calculate mass of compound
	 * */
	public void massOfCompound(int C,int H,int O){
		int totalMass=0;
		totalMass = C*massOfCarbon + H*massOfHydrogen + O*massOfOxygen;
		System.out.println("Total mass of compound is "+totalMass);
	}
}
