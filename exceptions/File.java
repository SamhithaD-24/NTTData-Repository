package exceptions;
import java.io.*;
public class File {

	void readFromFile() {
		try {
			FileInputStream fin = new FileInputStream("niyath.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.println((char)i);
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		void writeToFile()
		{
			FileOutputStream fout =null;
			try {
				fout = new FileOutputStream("niyath.txt");
				try {
					fout.write(65);
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				System.out.println("Written to file successfully");
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File f=new File();
 //f.writeToFile();
 f.readFromFile();
	}

}
