package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// Somando uma unidade de tempo
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25t15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		System.out.println("-------Acrescentar 4 horas na data----------");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR, 4);
		d = cal.getTime();
		System.out.println("Data + 4 horas:" + sdf.format(d));
		
		System.out.println("-------Obtendo uma unidade de tempo------");

		System.out.println("Saber os minutos:");
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutos: " + minutes);
		
		System.out.println("Saber o mes:");
		int mounth = 1 + cal.get(Calendar.MONTH);
		System.out.println("M�s: " + mounth);
		
	}

}

