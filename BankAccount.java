package depositaccount;
import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
		double AccountNumber;
		String AccountName;
		double balance =0;
		double deposit;
		Scanner user = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		AccountNumber = user .nextDouble();
		System.out.println("Enter the Account Name: ");
		AccountName = user .next(); 
		//Depositing
		System.out.println("Enter the Deposit Account: ");
		deposit = user.nextDouble();
		
		if (deposit>0) {
			balance = balance + deposit;
			System.out.println("Deposited Successfully");
		}
		else
		{
			System.out.println("Re-enter the correct amount");
		}
              scanner.close();
			
			
		
	}

}
