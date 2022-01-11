package myFirstJavaSession;

import java.text.DecimalFormat;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat numberFormat = new DecimalFormat("#0.00");

		String CokeStr = "Coke";
		String DietCokeStr = "Diet Coke";
		String RedBullRegularStr = "Red Bull Regular";
		String RedBullSugarFreeStr = "Red Bull Sugar Free";
		String CoffeeRegularStr = "Coffee Regular";
		String CoffeeDecafStr = "Coffee Decaf";
		String WaterStr = "Water";
		
		Double CokePrice = 2.00;
		Double DietCokePrice = 2.00;
		Double RedBullRegularPrice = 3.00;
		Double RedBullSugarFreePrice = 3.50;
		Double CoffeeRegularPrice = 2.50;
		Double CoffeeDecafPrice = 2.50;
		Double WaterPrice = 1.00;
		
		Double TaxRate = 0.05; 
	
		String selectItem = "Water";
		
		switch(selectItem) {
		case "Coke":
			Double CokeTax = CokePrice * TaxRate;
			Double CokeTotalPrice = CokePrice + CokeTax; 
			System.out.println("Item:  " + CokeStr + "\nPrice:  $" + CokePrice + "\nTaxes:  $" + numberFormat.format(CokeTax) + "\nTotal:  $" + numberFormat.format(CokeTotalPrice)); 
		break; 
		case "Diet Coke":
		Double DietCokeTax = DietCokePrice * TaxRate;
		Double DietCokeTotalPrice = DietCokePrice + DietCokeTax; 
		System.out.println("Item:  " + DietCokeStr + "\nPrice:  $" + DietCokePrice + "\nTaxes:  $" + 
		numberFormat.format(DietCokeTax) + "\nTotal:  $" + numberFormat.format(DietCokeTotalPrice)); 
		break;
		case "Redbull Regular":
		Double RedBullRegularTax = RedBullRegularPrice * TaxRate;
		Double RedBullRegularTotal = RedBullRegularTax + RedBullRegularPrice;
		System.out.println("Item:  " + RedBullRegularStr + "\n Price  $" + RedBullRegularPrice + "\n Tax Rate:  $" +
		numberFormat.format(RedBullRegularTax) + "\n Total:  $" + numberFormat.format(RedBullRegularTotal));
		break; 
		case "Red Bull Sugar Free": 
			Double RedBullSugarFreeTax = RedBullSugarFreePrice + TaxRate;
			Double RedBullSugarFreeTotal = RedBullSugarFreeTax + RedBullSugarFreePrice;
			System.out.println("Item:  " + RedBullSugarFreeStr + "\n Price:  $" + 
			RedBullSugarFreePrice + "\n Tax:  $" + numberFormat.format(RedBullSugarFreeTax) + "\n Total:  $" + numberFormat.format(RedBullSugarFreeTotal));
			break;
		case "Coffe Regular":
			Double CoffeeRegularTax = CoffeeRegularPrice * TaxRate;
			Double CoffeeRegularTotal = CoffeeRegularPrice + CoffeeRegularTax;
			System.out.println("Item:  " + CoffeeRegularStr + "\nPrice:  $" + CoffeeRegularPrice+ "\n Tax:  $" +
			numberFormat.format(CoffeeRegularTax) + "\nTotal:  $" + numberFormat.format(CoffeeRegularTotal));
			break; 
		case "Coffee Decaf": 
			Double CoffeeDecafTax = CoffeeDecafPrice * TaxRate; 
			Double CoffeeDecafTotal = CoffeeDecafPrice + CoffeeDecafTax; 
			System.out.println("Item:  " + CoffeeDecafStr + "\n Price:  $" + CoffeeDecafPrice + 
			"\n Tax:  $" + numberFormat.format(CoffeeDecafTax) + "\n Total:  $" + numberFormat.format(CoffeeDecafTotal));
			break; 
		case "Water":
		Double WaterTax = WaterPrice * TaxRate;
		Double WaterTotal = WaterPrice + WaterTax;
		System.out.println("Item:   " + WaterStr + 
						   "\nPrice:  $" + numberFormat.format(WaterPrice) + 
				           "\nTax:    $" + numberFormat.format(WaterTax) + 
				           "\nTotal:  $" + numberFormat.format(WaterTotal));
			
	break;
			
		
		}
		
	}

}
