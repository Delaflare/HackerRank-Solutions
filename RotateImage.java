

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotateImage {
	public static void main(String[] args) {
		
		//int[][] newarr = new int[3][3];
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
				
		
		
		
		 int rows = arr.length;
	        int columns = arr[0].length;
	        
	        int[][] newarr = new int[rows][columns];
	        int[][] newarr1 = new int[rows][columns];
		
	
		
		for (int i = 0; i < rows ; i++){ 
            for (int j = 0; j <columns ; j++) {
            	newarr[i][j] = arr[j][i];
            	//System.out.println(newarr[i][j]); 
            	
            }
            newarr1 = newarr;
	
		}
		
		for (int i = 0; i < rows ; i++){ 
            for (int j = 0; j <columns/2 ; j++) { // do only till mid point
            	int temp =newarr1[i][j];
            	newarr1[i][j] = newarr[i][columns-1-j];
            	newarr1[i][columns-1-j] = temp;
            	
	
            	}
			}
		for (int i = 0; i < rows ; i++){ 
            for (int j = 0; j <columns ; j++) {
            	System.out.println(newarr1[i][j]); 
	
            	}
			}

	}
}