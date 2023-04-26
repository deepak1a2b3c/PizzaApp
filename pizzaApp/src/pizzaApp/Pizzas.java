package pizzaApp;

import java.util.Scanner;

public class Pizzas {

	public static void main(String[] args) {
	
		//String V="Vegiterian",NV="Nvegiterian";String type="menu";
		String Pizzat=null;
		int price=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please Press 1 for veg Pizza and 2 for non-veg");
		int choice=sc.nextInt();
		if(choice==1) 
		{
			System.out.println(" Please select pizza ");
			System.out.println(" Press 1 for Deluxe Veggie");
			System.out.println(" Press 2 for Cheese and corn");
			System.out.println(" Press 3 for Paneer Tikka");
			int pizza=sc.nextInt();
			
			System.out.println(" Please select Size ");
			System.out.println(" Press 1 for Regular");
			System.out.println(" Press 2 for Medium");
			System.out.println(" Press 3 for Large");
			int size=sc.nextInt();
			
			switch(pizza)
			{
			case 1:{
				Pizzat="Deluxe Veggie";
				switch(size) {
				case 1:price=150;break;
				case 2:price=200;break;
				case 3:price=325;break;}
				}break;
			case 2:{
				Pizzat="Cheese and corn";
				switch(size) {
				case 1:price=175;break;
				case 2:price=375;break;
				case 3:price=475;break;}
				}break;	
			case 3:{
				Pizzat="Paneer Tikka";
				switch(size) {
				case 1:price=160;break;
				case 2:price=290;break;
				case 3:price=340;break;}
				}break;
				
			}
			
			System.out.println(" Please select Toppings ");
			System.out.println(" Press 1 for Black olive");
			System.out.println(" Press 2 for Capsicum");
			System.out.println(" Press 3 for Paneer");
			System.out.println(" Press 4 for Mushroom");
			System.out.println(" Press 5 for Fresh tomato");
			int top=sc.nextInt();
			
			switch(top)
			{
			case 1:price=price+20;break;
			case 2:price=price+25;break;
			case 3:price=price+35;break;
			case 4:price=price+30;break;
			case 5:price=price+10;break;
			}
			
		}
		else 
		{
			System.out.println(" Please select pizza ");
			System.out.println(" Press 1 for Non-Veg Supreme");
			System.out.println(" Press 2 for Chicken Tikka");
			System.out.println(" Press 3 for Pepper Barbecue Chicken");
			int pizza=sc.nextInt();
			
			System.out.println(" Please select Size ");
			System.out.println(" Press 1 for Regular");
			System.out.println(" Press 2 for Medium");
			System.out.println(" Press 3 for Large");
			int size=sc.nextInt();
			
			switch(pizza)
			{
			case 1:{
				Pizzat="Non-Veg Supreme";
				switch(size) {
				case 1:price=190;break;
				case 2:price=325;break;
				case 3:price=425;break;}
				}break;
			case 2:{
				Pizzat="Chicken Tikka";
				switch(size) {
				case 1:price=210;break;
				case 2:price=370;break;
				case 3:price=500;break;}
				}break;	
			case 3:{
				Pizzat="Pepper Barbecue Chicken";
				switch(size) {
				case 1:price=220;break;
				case 2:price=380;break;
				case 3:price=525;break;}
				}break;
				
			}
			
			System.out.println(" Please select Toppings ");
			System.out.println(" Press 1 for Chicken tikka");
			System.out.println(" Press 2 for Barbeque chicken");
			System.out.println(" Press 3 for Grilled chicken");
			int top=sc.nextInt();
			
			switch(top)
			{
			case 1:price=price+35;break;
			case 2:price=price+45;break;
			case 3:price=price+40;break;
			}
		}
		
		System.out.println(" want to add cheese");
		System.out.println(" Press 1 Yes");
		System.out.println(" Press 2 No");
		int cheese =sc.nextInt();
		
		if(cheese==1)
		{
			price=price+35;
		}
		
		System.out.println(" Please select side ");
		System.out.println(" Press 1 for Cold Drink");
		System.out.println(" Press 2 for cake");
		System.out.println(" Press 3 for not want to add anything");
		int side=sc.nextInt();
		if(side==1)
		{
			price=price+55;
		}
		else if(side==2)
		{
			price=price+90;
		}
		
		System.out.println(" Pizza Name: "+Pizzat+" and Price="+price);		
	

}
}