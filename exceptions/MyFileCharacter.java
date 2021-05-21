package exceptions;
import java.io.*;

public class MyFileCharacter {
	
	void writeToFile()
	{
		try {
			FileWriter file =new FileWriter("Text.txt");
			file.write("Hello Samhithaa");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
void readFromFile() {
	try {
		
		FileReader f = new FileReader("Text.txt");
		int c =fileread
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
