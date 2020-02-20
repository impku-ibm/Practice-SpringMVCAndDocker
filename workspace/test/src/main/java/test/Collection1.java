package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.ws.util.StringUtils;

public class Collection1 {
	int tempArray[];
	int arr[];
	int length;

	public static void main(String[] args) {
	int array [] = {98,34,56,78,45,56};
		Collection1 cl = new Collection1();
		cl.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+ " ");
		}
    }
	
	public void sort(int inputArr[]) {
		
		this.arr=inputArr;
		this.length=inputArr.length;
		this.tempArray=new int[length];
		divideArray(0,length-1);
	
	}
	
	public void divideArray(int lowerIndex , int higherIndex) {
		
		if(lowerIndex<higherIndex) {
			int midlle= lowerIndex+(higherIndex-lowerIndex)/2;
			//divide left and sort
			divideArray(lowerIndex,midlle);
			
			//Right side sort hoga idhr se
			divideArray(midlle+1,higherIndex);
			mergeArray(lowerIndex,midlle,higherIndex);
		}
	}
	public void mergeArray(int lowerIndex , int middle , int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempArray[i]=arr[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex) {
			if(tempArray[i]<=tempArray[j]) {
				arr[k]=tempArray[i];
				i++;
			}else {
				arr[k]=tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			arr[k]=tempArray[i];
			k++;
			i++;
		}
	}
	
}
