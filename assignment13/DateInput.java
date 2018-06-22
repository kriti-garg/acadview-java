import java.text.SimpleDateFormat;
import java.util.*;
public class DateInput{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date in format dd/mm/yyyy(like 22/06/2018)");
		String sdate;
		SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat targetFormat = new SimpleDateFormat("dd MMMM yyyy");
		sdate = sc.nextLine();
		Date date = originalFormat.parse(sdate);
		String formattedDate = targetFormat.format(date); 
		System.out.println("Date Format with dd MMMM yyyy : "+ formattedDate);
	}
}
