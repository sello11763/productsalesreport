/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    private String[] productNames;
    private int[][] productSales;

    // Constructor
    public Product(String[] productNames, int[][] productSales) {
        this.productNames = productNames;
        this.productSales = productSales;
    }

    // Q1.1 - Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {
                total += productSales[row][column];
            }
        }

        return total;
    }

    // Q1.1 - Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();

        int numberOfSales = 0;

        for (int row = 0; row < productSales.length; row++) {
            numberOfSales += productSales[row].length;
        }

        return (double) total / numberOfSales;
    }

    // Q1.1 - Determine most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestTotal = 0;
        int popularProductIndex = 0;

        for (int row = 0; row < productSales.length; row++) {

            int productTotal = 0;

            for (int column = 0; column < productSales[row].length; column++) {
                productTotal += productSales[row][column];
            }

            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                popularProductIndex = row;
            }
        }

        return productNames[popularProductIndex];
    }

    // Additional method to obtain the total sales of the most popular product
    public int GetMostPopularProductSales() {

        int highestTotal = 0;

        for (int row = 0; row < productSales.length; row++) {

            int productTotal = 0;

            for (int column = 0; column < productSales[row].length; column++) {
                productTotal += productSales[row][column];
            }

            if (productTotal > highestTotal) {
                highestTotal = productTotal;
            }
        }

        return highestTotal;
    }
}
