package Maryam;

import java.util.ArrayList;

public class Collection {
public static void main(String[] args) {
	int[] apple = new int[4];
	apple[0]=52;
	apple[1]=36;
	apple[2]=29;
	apple[3]=55;
	
	for(int i=0;i<apple.length;i=i+3) {
//or(int abc:apple) {advanced foorloop
//	System.out.println("The value of apple is: "+abc);
		System.out.println("The value of apple is: "+apple[i]);
	}
	
	String[] banana = new String[2];
	banana[0]= "One Pankaj";
	banana[1]= "Two Shamim";
	
	for(int i=0;i<banana.length;i++) {
	System.out.println("Best student :"+ banana[i]);
	}
	
	int [][] abc = new int [2][4];
	
	abc [0][3]= 38;
	abc [1][1]=28;
	
	System.out.println("Required number:" +abc [0][3]);
	System.out.println("Required number:" +abc [1][1]);
	
	
}

}

