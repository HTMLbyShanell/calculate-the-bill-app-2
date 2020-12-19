/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_vtipper;

/**
 *
 * @author Shanell Spann
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Date;

public class Calculate 
{
    String restaurantName;
    double billAmount;
    double tipPercent;
    double tipAmount;
    double t;
    double total;
    char runAgain = 'N';
    
    Scanner keyboard = new Scanner(System.in);
    
    public Calculate() /*constructor method*/ 
    {
        Intro();
        
        do
        {
            inputScreen();
            tipCalc();
            totalBill();
        }while (runAgain == 'Y');
                
    }
    
    public void Intro()
    {
       System.out.println("Hello, please press 'Enter' to calculate your bill. \t");  
    }
    
    public void inputScreen()
    {
        keyboard.nextLine();
        System.out.println("Enter Restaurant Name: ");
        restaurantName = keyboard.nextLine();
        System.out.println("Enter Total Bill Without Tip: ");
        billAmount = keyboard.nextDouble();  
        System.out.println("Enter Desired Tip Percentage: ");
        t = keyboard.nextDouble();
    }
    
    public void tipCalc()
    {
        tipPercent = t / 100;
        tipAmount = billAmount * tipPercent;
        total = billAmount + tipAmount; 
        
    }
    
    public void totalBill()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        Date d = new Date();
        System.out.println(d);
        
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Billed Amount: " + "$"+ df.format(billAmount));
        System.out.println("Tip Amount: $" + df.format(tipAmount));
        System.out.println("Total Bill with Tip: $" + df.format(total));
        System.out.println("Would you like to calculate again? Y or N");
        runAgain = keyboard.next().toUpperCase().charAt(0); /*code to get ONE character*/   
    }
}
    
