package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static int missingnumber(int [] arr){
int sum,arrsum=0,missingnum;
Arrays.sort(arr);
sum=(arr.length+1)*(arr.length+2)/2;
for (int i=0;i<arr.length;i++){
    arrsum+=arr[i];
}
missingnum=sum-arrsum;
return missingnum;
}
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Input array's length: ");
	int n=scan.nextInt();
	int [] arr = new int[n];
        System.out.println("Input array's numbers: ");
	for(int i=0;i<n;i++){
	    arr[i]=scan.nextInt();
    }
        System.out.println("Missing number is: "+ missingnumber(arr));
    }
}
