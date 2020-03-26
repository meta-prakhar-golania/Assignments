package infix;

/*@author Prakhar Golania
 * */
public class Main {
	
	public static void main(String[] args) {
		 String string = "(300+23)*(43-21)/(84+7)";
		if(Expression.create(string)){
			Expression.display();
			Postfix.calculate();
			Postfix.displayPost();
			System.out.println("\nExpression Result : "+Postfix.answer());
		}
		else{
			System.out.println("Wrong Mathematical Expression");
		}
	}
}
