/*
   input stream (keyboard)-> buffered stream -> program

import java.io.*;

public class IOClass {

	public static void main(String[] args){
		InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr); 
        try {
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Welcome "+name);
	}
catch(Exception e){
    System.out.println(e);
}
}
}
*/

/*
   input stream (keyboard)-> buffered stream -> program
 */
import java.io.*;

public class IOClass {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Welcome User 404 "+name);
	}

}