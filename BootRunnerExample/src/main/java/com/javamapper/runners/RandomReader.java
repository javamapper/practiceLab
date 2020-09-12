package com.javamapper.runners;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("data.random")
public class RandomReader {
	private String stringValue;
	private int intValue;
	private long longValue;
	private int intRangeValue;
	private long longRangeBtwinValue;
	private String uuidValue;
	private String intRangeBtwinValue;

	@Override
	public String toString() {
		return "RandomReader [stringValue=" + stringValue + ", intValue=" + intValue + ", longValue=" + longValue
				+ ", intRangeValue=" + intRangeValue + ", longRangeBtwinValue=" + longRangeBtwinValue + ", uuidValue="
				+ uuidValue + ", intRangeBtwinValue=" + intRangeBtwinValue + "]";
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public long getLongValue() {
		return longValue;
	}

	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	public int getIntRangeValue() {
		return intRangeValue;
	}

	public void setIntRangeValue(int intRangeValue) {
		this.intRangeValue = intRangeValue;
	}

	public long getLongRangeBtwinValue() {
		return longRangeBtwinValue;
	}

	public void setLongRangeBtwinValue(long longRangeBtwinValue) {
		this.longRangeBtwinValue = longRangeBtwinValue;
	}

	public String getUuidValue() {
		return uuidValue;
	}

	public void setUuidValue(String uuidValue) {
		this.uuidValue = uuidValue;
	}

	public String getIntRangeBtwinValue() {
		return intRangeBtwinValue;
	}

	public void setIntRangeBtwinValue(String intRangeBtwinValue) {
		this.intRangeBtwinValue = intRangeBtwinValue;
	}
}
