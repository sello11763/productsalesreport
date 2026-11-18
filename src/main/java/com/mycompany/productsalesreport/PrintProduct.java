/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {

    private Product product;

    // Constructor
    public PrintProduct(Product product) {
        this.product = product;
    }

    // Print total product sales
    public void PrintTotalProductSales() {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Print average product sales
    public void PrintAverageProductSales() {

        System.out.printf("AVERAGE PRODUCT SALES: %.2f%n",
                product.GetAverageProductSold());
    }

    // Print most popular product
    public void PrintMostPopularProduct() {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct()
                + " (" + product.GetMostPopularProductSales() + ")");
    }

    // Print complete report
    public void PrintReport() {

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("***************************************");

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProduct();

        System.out.println("***************************************");
    }
}