package com.bridgelabz.stockmanagement.stock;

import com.bridgelabz.stockmanagement.stock.Portpolio;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {

        System.out.println("Welcome to stock Account Management System.");
        System.out.print("Enter the number of stocks you want to add : ");

        Portpolio stockPortfolio = new Portpolio();
        Scanner scanner = new Scanner(System.in);
        int numberOfStock = scanner.nextInt();

        for (int index = 0; index < numberOfStock; index++) {

            stockPortfolio.readStockData(index + 1);
        }
        stockPortfolio.calculateStock();
    }
}
