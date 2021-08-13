package com.techment.arrayassignment;

import java.util.*;
public class Marks_Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int marks[] = new int[10];
		int sum =0;
		 //For insertion Of Marks
		 for (int i =0; i <10;i++)
		 {
			 System.out.println("Insert The Marks of Subject "+(i+1));
			 marks[i]=scanner.nextInt();
		 }
		 //for sorting
		 for(int i = 0;i<marks.length;i++)
			{
			 for (int j =(i+1);j<marks.length;j++)
			 {
				 if(marks[i]>marks[j])
				 {
					 int swap=marks[j];
					 marks[j]=marks[i];
					 marks[i]=swap;
					 
				 }
			 }
			}
		 for (int i=0; i<marks.length; i++)   
		 { System.out.println("Marks of Subject " +(i+1)+" is :"+marks[i]);
		 //sum+=marks[i];
		
		 }
						scanner.close();

	}

}
