import java.util.Scanner; 
import java.io.*;

class NumToPow {
	public static void main(String args[])
    {
		System.out.print("Введите число: ");
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();

		System.out.print("Введите степень: ");
		Scanner scan2 = new Scanner(System.in);
		int pow = scan2.nextInt();

		System.out.println(Math.pow(number, pow));
        double result = Math.pow(number, pow);
        File file = new File ("output.txt");
        try
        {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println (result);
            printWriter.close();       
        }
        catch (FileNotFoundException ex)  
    {
        System.out.println(result);
    }
    scan1.close();
    scan2.close();
    }
}