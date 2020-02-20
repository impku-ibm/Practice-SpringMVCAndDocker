package test;

import java.util.HashMap;
import java.util.Map;

import java.lang.reflect.*;

public class Map1 {

	public static void main(String[] args) {
//int arr[]= {2,3,10,6,4,8,1};
//int difference = arr[1]-arr[0];
//int i,j;
//for (i=0;i<arr.length;i++) {
//	
//	for( j=i+1;j<arr.length;j++) {
//		
//		if(arr[j]-arr[i]>difference)
//			difference=arr[j]-arr[i];
//	}
//	
//	//if(j==arr.length)
//	
//}
//System.out.println(difference);
//		int n =39 ;
//		int m=9;
//		int n2;
//		int q=n/m;
//		int n1=m*q;
//		if((n*m)>0) {
//			
//			n2=m*(q+1);
//		
//		}else {
//		
//			n2=m*(q-1);
//		}
//		if(Math.abs(n-n1)<Math.abs(n-n2)) {
//			
//			System.out.println(n1);
//		}
//		else {
//			System.out.println(n2);
//		}
//		StringBuilder str = new StringBuilder("GeeksForGeek");
//		System.out.println(str.reverse());
//		
		try {
			Class c = Class.forName("java.awt.Dimensions");
			Field f[] = c.getFields();
			for(int i=0;i<f.length;i++) 
				System.out.println(f[i]);
			
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
	}

}
