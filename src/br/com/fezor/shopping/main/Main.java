package br.com.fezor.shopping.main;

import br.com.fezor.shopping.models.CreditCard;
import br.com.fezor.shopping.models.Shopping;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please Type the credit card limit: ");
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0){
            System.out.println("Type the shopping description: ");
            String description = read.next();

            System.out.println("Type the shopping price: ");
            double price = read.nextDouble();

            Shopping shopping = new Shopping(description, price);
            boolean purchaseMade = card.buy(shopping);

            if(purchaseMade){
                System.out.println("Purchase made!");
                System.out.println("Type 0 to exit or 1 to continue shopping");
                exit = read.nextInt();
            }else{
                System.out.println("Insufficient limit");
                exit = 0;
            }
        }

        System.out.println("------------------------");
        System.out.println("Your shopping resume: \n");
        Collections.sort(card.getShopping());
        for(Shopping shopping : card.getShopping()){
            System.out.println(shopping.getDescription() + " - " + shopping.getPrice());
        }
        System.out.println("------------------------");

        System.out.println("\nCard balance: " + card.getBalance());
    }
}
