package Maryam;

public class VariableTypes {
	static int myAccountBalance;

	public static void main(String[] args) {
		myAccountBalance =400;
		
		if(myAccountBalance>100 & myAccountBalance<1000) {
			System.out.println("You don't have enough money");
	}
		else if(myAccountBalance<=99) {
			System.out.println("You are homeless");
		}
		
		else {
			System.out.println("You have enough money");
		}
	}

}
