package br.com.dados;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		Date date1 = new Date();
		
		if(date.compareTo(date1) == 0) {
		System.out.println("A Data é IGUAL");
		} else {
			System.out.println("A ");
		}

}
}