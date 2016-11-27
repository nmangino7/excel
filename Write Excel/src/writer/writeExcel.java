package writer;
import java.util.*;
import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.write.*;
import jxl.write.Number;


public class writeExcel
{
	public static void main(String args[]) throws IOException, WriteException
	{
		String respond;
		Scanner scan = new Scanner(System.in);
		try{
			String fileName = "I:\\Excel\\test.xls";
			WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
			WritableSheet sheet = workbook.createSheet("Sheet1", 0);
			
			
			System.out.println("Do you want to add a lable");
			String yn = scan.nextLine();
			if(yn.contains("Yes"))
			{
				int y = 0; 
				int x = 0;
				System.out.println("What do you want the label to say?");
				String Lab = scan.nextLine();
			Label label = new Label(x,y,Lab);
			sheet.addCell(label);
			
			
			System.out.println("Do you want another label");
			yn = scan.nextLine();
			
			System.out.println("Do you want to labels across the top or side?");
			 respond = scan.nextLine();
			//*************************************
			// If wants be on side I happens here
			//************************************
			if(respond.contains("s")|| respond.contains("side")|| respond.contains("S"))
			{
			while(yn.contains("Yes")|| yn.contains("Y"))
			{
				y++;	
				System.out.println("What should the label say?");
				  Lab = scan.nextLine();
				Label labelt = new Label(x,y,Lab);
				sheet.addCell(labelt);
				
				System.out.println("Do you want another label");
				yn = scan.nextLine();
			}
			}	
			//***********************************
			// This will make it on the top
			//*************************************
			else{
				while(yn.contains("Yes")|| yn.contains("Y"))
				{
					x++;	
					System.out.println("What should the label say?");
					  Lab = scan.nextLine();
					Label labelt = new Label(x,y,Lab);
					sheet.addCell(labelt);
					
					System.out.println("Do you want another label");
					yn = scan.nextLine();
				}
			}
			//******************************
			//END OF LABEL SECTION
			//******************************
			}
			
			
			System.out.println("Do you want to add a number");
			 yn = scan.nextLine();
			 
			if(yn.contains("Yes"))
			{
				System.out.println("Did you do the label across the side or top?");
				respond = scan.nextLine();
				if(respond.contains("s"))
				{
				int y = 0; 
				int x = 1;
				System.out.println("What do you want the num to be?");
				String Lab = scan.nextLine();
			Label label = new Label(x,y,Lab);
			sheet.addCell(label);
			
			
			System.out.println("Do you want another num");
			yn = scan.nextLine();
			while(yn.contains("Yes")|| yn.contains("Y"))
			{
				y++;			
				System.out.println("What should the num to be?");
				//String nums = scan.nextLine();
				double go = scan.nextDouble();
				Number nums = new Number(x,y, go);
				sheet.addCell(nums);
				//Lab = scan.nextLine();
				//Label labelt = new Label(x,y, nums);
				//sheet.addCell(labelt);
				
				System.out.println("Do you want another num");
				yn = scan.nextLine();
			}//While tag
				}//Side if tag
				
				//********************************
				//FOR LABEL TOP
				//********************************
				else{
					int y = 1; 
					int x = 0;
					System.out.println("What do you want the num to be?");
					String Lab = scan.nextLine();
				Label label = new Label(x,y,Lab);
				sheet.addCell(label);
				
				
				System.out.println("Do you want another num");
				yn = scan.nextLine();
				while(yn.contains("Yes")|| yn.contains("Y"))
				{
					x++;			
					System.out.println("What should the num to be?");
					String nums = scan.nextLine();
					
					Lab = scan.nextLine();
					Label labelt = new Label(x,y, nums);
					sheet.addCell(labelt);
					
					System.out.println("Do you want another num");
					yn = scan.nextLine();
				}//While tag
				}
			}//Yes tag
			
			
			workbook.write();
			workbook.close();
			
		}catch (WriteException e){
			
		}
	}
	
	}

