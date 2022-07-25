package helloworld;
import java.text.SimpleDateFormat;
import java.util.*;
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat d =new SimpleDateFormat();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.getTime());
		System.out.println(d.format(cal.getTime()));
		cal.add(Calendar.MINUTE, 30);
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
