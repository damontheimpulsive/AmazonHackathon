package com.amazon.util;

import java.util.Locale;
import java.util.ResourceBundle;

import com.amazon.constants.DataBaseConstants;
import com.amazon.constants.ErrorConstants;
import com.amazon.constants.SuccessConstants;
import com.amazon.constants.UIConstants;

public final class PropertyUtil {

	private PropertyUtil() {

	}

	private static ResourceBundle getBundles(final String filename) {
		final Locale currentLocale = Locale.getDefault();
		return ResourceBundle.getBundle(filename, currentLocale);

	}

	public static String getSuccessMessage(final String key) {
		final ResourceBundle messages = getBundles(SuccessConstants.SUCCESSMESSAGES);
		return messages.getString(key);

	}

	public static String getErrorMessage(final String key) {
		final ResourceBundle messages = getBundles(ErrorConstants.ERRORMESSAGES);
		return messages.getString(key);

	}

	public static String getPharmaErrorMsg(final String key) {
		final ResourceBundle messages = getBundles(ErrorConstants.PHARMAERRORMSG);
		return messages.getString(key);
	}

	public static String getDataBaseUrl() {
		final ResourceBundle url = getBundles(DataBaseConstants.DBPROPERTIES);
		return url.getString("database.url");
	}

	public static String getDataBaseDriver() {
		final ResourceBundle driver = getBundles(DataBaseConstants.DBPROPERTIES);
		return driver.getString("driver");
	}

	public static String getDataBaseUserName() {
		final ResourceBundle userName = getBundles(DataBaseConstants.DBPROPERTIES);
		return userName.getString(DataBaseConstants.DATABASEUSERNAME);
	}

	public static String getDataBasePassWord() {
		final ResourceBundle passWord = getBundles(DataBaseConstants.DBPROPERTIES);
		return passWord.getString(DataBaseConstants.DATABASEPASSWORD);
	}

	public static String getDataBase() {
		final ResourceBundle passWord = getBundles(DataBaseConstants.DBPROPERTIES);
		return passWord.getString(DataBaseConstants.DATABASETYPE);

	}

	public static String getUIText(final String label) {
		final ResourceBundle bundle = getBundles(UIConstants.UITEXT);
		return bundle.getString(label);

	}

}
