package com.intellectdesign.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtill {
	
	
	public static boolean isValidDate(String pDateString) throws ParseException {
        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(pDateString);
        return new Date().before(date);
}

}
