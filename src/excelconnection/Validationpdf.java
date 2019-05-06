package excelconnection;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Validationpdf {

	 WebDriver driver;
	 
	 
	 Validationpdf(WebDriver driver){
		 this.driver=driver;
	 }
	 
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		          dirContents[i].delete();
		          Validationpdf.checkExists(downloadPath,fileName);
		          return true;
		          
		      }
		          }
		      return false;
		  } 
	
	
	public boolean sampleTest(){ //test method
        //your code
        boolean abletoOpenPDF=linkResponse(driver.getCurrentUrl());
        System.out.println("abletoOpenPDF" +abletoOpenPDF);
        return abletoOpenPDF;

    }

    public boolean linkResponse(String url){
        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
	
	

    	} 
    public static void checkExists(String directory, String file) {
	    File dir = new File(directory);
	    File[] dir_contents = dir.listFiles();
	    String temp = file ;
	    
	    for(int i = 0; i<dir_contents.length;i++) {
	        if(dir_contents[i].getName().contains(file))
	        	  System.out.println("Filename: "+dir_contents[i].getName());	
	        	  dir_contents[i].delete();
	           
	    }
}
}