package gov.acwi.wqp.etl;


public abstract class BaseProcessor {
	
	private final static String TRIM = "^\\s+|\\s+$";
	
	protected String trimString(String value) {
		if (null != value) {
			return value.replaceAll(TRIM,  "");
		} 
		return value;
	}
}
