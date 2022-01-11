package myFirstJavaSession;

import java.text.DecimalFormat;

public class javaPractice1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

DecimalFormat numberFormat = new DecimalFormat("#0.00");

String strCoke = "Coke";
String strDietCoke = "Diet Coke";
String strRedbulRegular = "Redbull Regular";
String strRedbullSugerFree = "Redbull SugerFree";
String strCoffeeRegular = "Coffee Regular";
String strCoffeeDeCafe = "Coffee DeCafe";
String strWater = "Water";

double cokePrice = 2;
double dietCokePrice = 2;
double redbullRegularPrice = 3;
double redbullSugerFreePrice = 3;
double coffeeRegularPrice = 2.50;
double coffeeDeCafePrice = 2.50;
double waterPrice = 1;

double taxRate = 0.05;

String selectItem = "Coke";

switch(selectItem){
case "Coke":
	double cokeTaxRate = cokePrice * taxRate;
	double cokeTotalPrice = cokePrice + cokeTaxRate;
	System.out.println("Item:      " +  strCoke + "\nPrice:     $" +  cokePrice + "\nTaxes:     $" + 
	numberFormat.format(cokeTaxRate) + "\nTotal:     $" + numberFormat.format(cokeTotalPrice));
	break;
case "Diet Coke":
	System.out.println("Item:      " +  strDietCoke);
	System.out.println("Price:     " +  dietCokePrice);
	double dietCokeTaxRate = dietCokePrice * taxRate;
	System.out.println("Taxes:     " + numberFormat.format(dietCokeTaxRate));
	double dietCokeTotalPrice = dietCokePrice + dietCokeTaxRate;
	System.out.println("Total:     " + numberFormat.format(dietCokeTotalPrice));
	break;
case "Redbull Regular":
	System.out.println("Item:      " +  strRedbulRegular);
	System.out.println("Price:     " +  redbullRegularPrice);
	double redbullRegularTaxRate = redbullRegularPrice * taxRate;
	System.out.println("Taxes:     " + numberFormat.format(redbullRegularTaxRate));
	double redbullRegularTotalPrice = redbullRegularPrice + redbullRegularTaxRate;
	System.out.println("Total:     " + numberFormat.format(redbullRegularTotalPrice));
	break;
case "Redbull SugerFree":
	System.out.println("Item:      " +  strRedbullSugerFree);
	System.out.println("Price:     " +  redbullSugerFreePrice);
	double redbullSugerFreeTaxRate = redbullSugerFreePrice * taxRate;
	System.out.println("Taxes:     " + numberFormat.format(redbullSugerFreeTaxRate));
	double redbullSugerFreeTotalPrice = redbullSugerFreePrice + redbullSugerFreeTaxRate;
	System.out.println("Total:     " + numberFormat.format(redbullSugerFreeTotalPrice));
	break;
case "Coffee Regular":
	System.out.println("Item:      " +  strCoffeeRegular);
	System.out.println("Price:     " +  coffeeRegularPrice);
	double coffeeRegularTaxRate = coffeeRegularPrice * taxRate;
	System.out.println("Taxes:     " + numberFormat.format(coffeeRegularTaxRate));
	double coffeeRegularTotalPrice = coffeeRegularPrice + coffeeRegularTaxRate;
	System.out.println("Total:     " + numberFormat.format(coffeeRegularTotalPrice));
	break;
case "Coffee DeCafe":
	System.out.println("Item:      " +  strCoffeeDeCafe);
	System.out.println("Price:     " +  coffeeDeCafePrice);
	double coffeeDeCafeTaxRate = coffeeDeCafePrice * taxRate;
	System.out.println("Taxes:     " + numberFormat.format(coffeeDeCafeTaxRate));
	double coffeeDeCafeTotalPrice = coffeeDeCafePrice + coffeeDeCafeTaxRate;
	System.out.println("Total:     " + numberFormat.format(coffeeDeCafeTotalPrice));
	break;
case "Water":
	System.out.println("Item:      " +  strWater);
	System.out.println("Price:     " +  waterPrice);
	double waterTaxRate = waterPrice * taxRate;
	System.out.println("Taxes:     " + numberFormat.format(waterTaxRate));
	double waterTotalPrice = waterPrice + waterTaxRate;
	System.out.println("Total:     " + numberFormat.format(waterTotalPrice));
	break;
}

	}

}
