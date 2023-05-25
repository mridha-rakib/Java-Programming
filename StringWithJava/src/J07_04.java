//import java.util.io.*;
import java.io.DataInputStream;
import java.util.Scanner;

public class J07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		DataInputStream inData = new DataInputStream(System.in);
		
		String name;
		Name = new String( "" );
		
		try {
			System.out.println("Please input name ");
			Name = inData.readLine();
		} catch( Exception E ) {
			System.out.println("Your name is : " + Name);
		}
		
	}

}
