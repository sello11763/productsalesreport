/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsalesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of GetTotalProductsSold method, of class Product.
     */
    @Test
    public void testGetTotalProductsSold() {
        System.out.println("GetTotalProductsSold");
        Product instance = null;
        int expResult = 0;
        int result = instance.GetTotalProductsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAverageProductSold method, of class Product.
     */
    @Test
    public void testGetAverageProductSold() {
        System.out.println("GetAverageProductSold");
        Product instance = null;
        double expResult = 0.0;
        double result = instance.GetAverageProductSold();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetMostPopularProduct method, of class Product.
     */
    @Test
    public void testGetMostPopularProduct() {
        System.out.println("GetMostPopularProduct");
        Product instance = null;
        String expResult = "";
        String result = instance.GetMostPopularProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetMostPopularProductSales method, of class Product.
     */
    @Test
    public void testGetMostPopularProductSales() {
        System.out.println("GetMostPopularProductSales");
        Product instance = null;
        int expResult = 0;
        int result = instance.GetMostPopularProductSales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
