package javatraining;
import java.util.Scanner;
public class Items{
	
	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n= sc.nextInt();
		sc.nextLine();
		while (n <= 0) {
            System.out.println("Number of items should be greater than 0. Enter again:");
            n = sc.nextInt();
            sc.nextLine();
        }
		String items[] = new String[n];
		int price[]= new int[n];
		int tot=0;
		int coins=0;
		int change=0;
		for (int i=0; i<n; i++)
		{
			System.out.println("Enter the name of the item:");
			items[i]=sc.nextLine();
			boolean validity=false;
			while(!validity) {
				System.out.println("Enter the price of the item:");
				price[i]=sc.nextInt();
				sc.nextLine();
				if(price[i]>0) 
				{
					validity=true;
				}
				else
				{
					System.out.println("Price of the item should be greater than 0. Enter again:");
				}
			}
			tot=tot+price[i];
		}
		
		System.out.println("The total is: "+tot);
		
		int payment=0;
		while(true) {
			System.out.println("Enter the payment amount:");
			payment=sc.nextInt();
			sc.nextLine();
			if(payment>0)
			{
				if(payment<tot)
					System.out.println("Payment is not sufficient. Enter amount again.");
				else
					break;
			} else
				System.out.println("Payment should be greater than 0. Enter again.");
		}
		
		
		if(payment==tot) {
			System.out.println("Payment received is matching the total.");
		}
		else {
			change=payment-tot;
			System.out.println("Payment extends the total amount and your change is: "+change);
		}
		
		int[] arr1= {5000,1000,500,200,100,50,20,10,5,2,1};
		System.out.println("Calculating minimum number of coins.");
		for (int i=0; i<arr1.length;i++)
		{
			if(change>=arr1[i]) {
				int count=change/arr1[i];
				change=change%arr1[i];
				coins=coins+count;
				System.out.println("For the denomination of: "+arr1[i]+", we need "+":"+count+" coins");
				System.out.println("Remaining amount: "+change);
			}
		}
		
		System.out.println("Total coins used: " + coins);
		sc.close();
	
	}
	
}