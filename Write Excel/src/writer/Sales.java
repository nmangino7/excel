package writer;
import java.util.*;
import java.util.*;
import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.write.*;
import jxl.write.Number;
public class Sales {

	public static void main(String[] args) throws IOException, WriteException {
		Scanner scan = new Scanner(System.in);
		try{
			String fileName = "I:\\Excel\\sale.xls";
			WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
			WritableSheet sheet = workbook.createSheet("Sheet1", 0);
		int sale = 0;
		int z = 0;
		int run;
		int x=0;
		int y = 1;
		
		int sx = 1;
		int sy= 1;
		int total = 0;
		Label labelp = new Label(0,0,"Month");
		sheet.addCell(labelp);
		while(z <= 11)
		{
			if(z == 0){
				for( run = 0 ; run <= 11 ; run++)
				{
					System.out.println("Enter the month");
					String month = scan.nextLine();
					Label label = new Label(x,y,month);
					sheet.addCell(label);
					y++;
				}
			}
			
			
			System.out.println("Sale");
			sale = scan.nextInt();
			Number numbers = new Number(sx,sy, sale);
			sheet.addCell(numbers);
			total += sale;
			
			sy++;
			z++;
			y++;
			
			if(z == 12)
			{
				Label labelt = new Label(0,13,"Total Sale for the year");
				sheet.addCell(labelt);
				Number number = new Number(1, 13 , total);
				sheet.addCell(number);
				
				double avg = total / 12 ;
				Number numbera = new Number(1, 14, avg);
				sheet.addCell(numbera);
				
				Label laba = new Label(0, 14 , "Average sales");
				sheet.addCell(laba);
			}
			
			if(z==12)
			{
				System.out.println("What was the cost of sales?");
				double cost = scan.nextDouble();
				Label costo = new Label(0, 15, "The cost of sales was");
				sheet.addCell(costo);
				Number numc = new Number(1,15, cost);
				
				Label profit = new Label(0,16,"The profit is:");
				sheet.addCell(profit);
				
				double profits = total - cost;
				Number pro = new Number(1,16, profits);
				sheet.addCell(pro);
			}
		}
		
		workbook.write();
		workbook.close();
		}catch (WriteException e){
			
		}
	}

}
