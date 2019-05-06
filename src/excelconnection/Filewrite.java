package excelconnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
	




		static BufferedWriter bw = null;
		static FileWriter fw = null;
		
		
		
		public static void datasave(String content,String filename){
			
			
			try {
				 fw = new FileWriter(filename,true);
				 bw = new BufferedWriter(fw);
			    bw.write(content);
			    bw.newLine();
			    //bw.write("Done");
			
				}catch (IOException e)
			 	{
				  e.printStackTrace();
				}
			
			//System.out.println("Done");
			 finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}

				}
		}
		
		public static String dataread(String file) {
			BufferedReader br;
			String st = null; 
			try {
				br = new BufferedReader(new FileReader(file));
			
			  try {
				
				   //System.out.println(st);
				   st = br.readLine();
			  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 // System.out.println(st);
			return st; 
		}
	}



