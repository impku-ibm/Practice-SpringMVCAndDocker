package test;

import java.util.Optional;

public class Array extends B{
//  public static void printSubArray(int arr[] , int start , int end) {
//	  System.out.println("Start ek dum shure "+ start);
//	  System.out.println("End ek dmm shure me " + end);
//	  if(end==arr.length) {
//		  return;
//	  }
//	  
//	 
//	  else if(start>end){
//		  System.out.println("Start first  " + start + " END " + end);
//		  printSubArray(arr,0,end+1);
//	  }
//	  else {
//		  System.out.println("START "+ start);
//		  System.out.println("END " + end);
//		  System.out.print("[" );
//		 
//		  for(int i=start;i<end;i++)
//		  {
//			  System.out.println("Start inside loop " + start + " end loop " + end);
//			  System.out.print(arr[i]+", ");
//		  } 
//		  System.out.println(arr[end]+"]"); 
//		  printSubArray(arr, start + 1, end); 
//	  }
//	  return;
//  } 
//	private Array(int a) {}
	
	public static void main(String[] args) throws Exception {
		
//		B c = new B();
//		c.show();
//		c.display();
	}

@Override
void show() {
	System.out.println("Abstract");
	
}
Array ar = new Array();
ar.display();

//	@Override
//	void show() {
//		// TODO Auto-generated method stub
//		
//	}

}
