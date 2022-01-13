package com.bridgelabz.base.arrays;

import java.util.Scanner;

public class ArraysDemo {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//One Dimentional Array
		
		String stringArray[] = {"SHubham", "Rahul"};
		
		for(int i=0;i< stringArray.length;i++) {
			System.out.print(stringArray[i]+", ");
		}
		
		stringArray[0] = "Mayur";
		System.out.println();
		
		for(int i=0;i< stringArray.length;i++) {
			System.out.print(stringArray[i]+", ");
		}
		
		System.out.println();
		Double doubleArrays[] = new Double[5];
		
		System.out.println(doubleArrays.length);
		
//		for(int i=0;i< doubleArrays.length;i++) {
//			System.out.println("Enter value");
//			doubleArrays[i] = scanner.nextDouble();
//		}
//		
//		System.out.print("[");
//		for(int i=0;i< doubleArrays.length;i++) {
//			System.out.print(doubleArrays[i]+", ");
//		}
//		
//		System.out.print("]");
		
		Object objects[] = {1,"sdfsd",2.4,'C',false};
		
		for(int i=0;i< objects.length;i++) {
			System.out.print(objects[i]+", ");
		}
		
		System.out.println();
		
		String twoDimArrays[][] = {
				{"SHubham","Rahul","Mayur"},
				{"Sonu","Prachi","Divya"},
				{"Virat","Rahul","Rahane"}
		};
		
		//i is using for row
				for(int i=0;i<twoDimArrays.length;i++) {
					//j is using column
					for(int j=0; j<twoDimArrays.length; j++) {
						System.out.print(twoDimArrays[i][j]+"\t");
					}
					System.out.println();
				}
				
				
		int row = 4;
		int col = 3;
		int numbers[][] = new int[row][col];
		
//		//i is using for row
//				for(int i=0;i<row;i++) {
//					//j is using column
//					for(int j=0; j<col; j++) {
//						System.out.println("Enter the number");
//						numbers[i][j] = scanner.nextInt();
//					}
//				}
		
		System.out.println("Enter the position1");
		int pos1 = scanner.nextInt();
		
		System.out.println("Enter the position2");
		int pos2 = scanner.nextInt();
		
				System.out.println("Enter the number");
				numbers[pos1][pos2] = scanner.nextInt();
				
				//i is using for row
				for(int i=0;i<row;i++) {
					//j is using column
					for(int j=0; j<col; j++) {
						System.out.print(numbers[i][j]+"\t");
					}
					System.out.println();
				}
	}
}
