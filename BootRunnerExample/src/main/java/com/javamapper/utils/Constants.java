package com.javamapper.utils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Consumer;

public class Constants {
	@SuppressWarnings("rawtypes")
	public final static Consumer sop = (str) -> {
		System.out.println(str);
	};
	public final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy'T'HH:mm:ss:SSS z");
	public final static Consumer<String> zDateTimeAtOffset = date -> ZonedDateTime.parse(date, DATE_TIME_FORMATTER);

	public static Date getValue(String str) {
		return Date.from(ZonedDateTime.parse(str, DATE_TIME_FORMATTER).toInstant());
	}

	private Constants() {

	}
}
