import java.util.Date;
import java.text.*;
class DateTest{
	public static void main(String[] args) {

		SimpleDateFormat ft=new SimpleDateFormat("yyyy.mm.dd");
		Date d=new Date();
		//System.out.println(d.toString());
		System.out.println(ft.format(d));
	}
}