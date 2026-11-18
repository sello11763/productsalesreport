/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Productsalesreport {
    
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single-dimensional array
        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array
        int[][] productSales = new int[3][3];

        // Enter sales for each product
        for (int product = 0; product < productNames.length; product++) {

            for (int month = 0; month < 3; month++) {

                System.out.print(
                        "Enter number of sales for month "
                        + (month + 1)
                        + " for "
                        + productNames[product]
                        + " mattress: "
                );

                productSales[product][month] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(productNames, productSales);

        // Create PrintProduct object
        PrintProduct printProduct = new PrintProduct(product);

        // Display report
        printProduct.PrintReport();

        input.close();
    }
}