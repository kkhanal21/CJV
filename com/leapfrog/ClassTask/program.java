/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ClassTask;

import java.util.Scanner;

/**
 *
 * @author Cena
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] items = new String[3];
        int[] prices = new int[items.length];
        int[] qty = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter the Items Name: ");
            items[i] = input.next();
            System.out.println("Enter the Items Prices: ");
            prices[i] = input.nextInt();
            System.out.println("Enter the Items qty: ");
            qty[i] = input.nextInt();
        }
        while (true) {
            System.out.println("1.Show Items");
            System.out.println("2.Show avialable quantities");
            System.out.println("3.Order By price Ascending");
            System.out.println("4.Order By Quantity Ascending");
            System.out.println("5.Order By price Descending");
            System.out.println("6.Order By Quantity Descending");
            System.out.println("7.Search");
            
            System.out.println("8.Exit");
            System.out.println("Enter your choice [1-6]:");

            int ch = input.nextInt();

            if (ch == 1) {
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i] + "\t" + "Nrs" + prices[i]);
                }

            } else if (ch == 2) {
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i] + "\t" + qty[i] + "Plates");
                }

            } else if (ch == 3) {
                for (int i = 0; i < prices.length; i++) {
                    for (int j = i + 1; j < prices.length; j++) {
                        if (prices[i] > prices[j]) {
                            int temp = prices[i];
                            String temp1 = items[i];
                            prices[i] = prices[j];
                            items[i] = items[j];
                            prices[j] = temp;
                            items[j] = temp1;
                        }
                    }

                    System.out.println(items[i] + "\t" + prices[i]);
                }

            } else if (ch == 4) {
                for (int i = 0; i < prices.length; i++) {
                    for (int j = i + 1; j < prices.length; j++) {
                        if (qty[i] > qty[j]) {
                            int temp = qty[i];
                            String temp1 = items[i];
                            qty[i] = qty[j];
                            items[i] = items[j];
                            qty[j] = temp;
                            items[j] = temp1;
                        }
                    }
                     System.out.println(items[i] + "\t" + qty[i]);
                }
            }else if (ch == 5) {
                for (int i = 0; i < prices.length; i++) {
                    for (int j = i + 1; j < prices.length; j++) {
                        if (prices[i] < prices[j]) {
                            int temp = prices[i];
                            String temp1 = items[i];
                            prices[i] = prices[j];
                            items[i] = items[j];
                            prices[j] = temp;
                            items[j] = temp1;
                        }
                    }

                    System.out.println(items[i] + "\t" + prices[i]);
                }
        }else if(ch==6) {
                for (int i = 0; i < prices.length; i++) {
                    for (int j = i + 1; j < prices.length; j++) {
                        if (qty[i] < qty[j]) {
                            int temp = qty[i];
                            String temp1 = items[i];
                            qty[i] = qty[j];
                            items[i] = items[j];
                            qty[j] = temp;
                            items[j] = temp1;
                        }
                    }
                     System.out.println(items[i] + "\t" + qty[i]);
                }
            }else if(ch==7){
                System.out.println("Enter Keyword");
                String s=input.next();
          for(int i=0;i<items.length;i++){
                if(items[i].contains(s)){
                    System.out.println(items[i]);
            }
          }
            } 
        else {
                System.exit(0);
                
            }
        }
    }
}
