package com.msdtt.framework.controller.base;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author zhuxd@wjs.com
 * @date 2017/9/26 16:06
 */
public class IntegerEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Integer result;
		try{
			result = Integer.valueOf(text);
		}catch(Exception e){
			text = text.replace("GMT", "").replaceAll("\\(.*\\)", "");
			SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss z", Locale.ENGLISH);
			try{
				Date date = sdf.parse(text);
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
				String resultStr = sdf1.format(date);
				result = Integer.valueOf(resultStr);
			}catch(ParseException e1){
				result = null;
			}
		}
		setValue(result);
	}

	@Override
	public String getAsText() {
		return getValue().toString();
	}
}
