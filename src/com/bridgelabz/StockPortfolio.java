package com.bridgelabz;
import java.util.*;


public class StockPortfolio {
	Scanner sc = new Scanner(System.in);
	public static int stock(int n){		
		int numOfStock = n;
		int numOfShare, sharePrice, valuePerShare;
		int valuation = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < numOfStock;i++) {
			System.out.println("Enter "+(i+1)+" details stock");
			System.out.println("Enter the Number of Shares you hold of "+(i+1)+" Stock");
			numOfShare = sc.nextInt();
			System.out.println("Enter the price"+(i+1)+" Stock");
			sharePrice = sc.nextInt();
			valuePerShare = numOfShare*sharePrice;
			valuation = valuePerShare + valuation; 
		}
		sc.close();
		return valuation;
	}
	
	public static void printReport(int n,int stockvaluation) {
		System.out.println("Person holds total "+n+"stocks with valuation of "+stockvaluation);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter how many stock you hold");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stockValuation = stock(n);
		printReport(n,stockValuation);
		sc.close();
		
	}
}
