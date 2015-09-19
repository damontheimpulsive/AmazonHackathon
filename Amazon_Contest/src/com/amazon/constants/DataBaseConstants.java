package com.amazon.constants;

public final class DataBaseConstants {

	private DataBaseConstants() {
	}

	public static final String DBPROPERTIES = "dataBase";

	public static final String DATABASEUSERNAME = "database.username";

	public static final String DATABASEPASSWORD = "database.password";

	public static final String DATABASETYPE = "database.databaseType";

	public static final String QUERY_USER_VALID = "SELECT USER_ID,USER_NAME,USER_PASSWORD FROM Login_Details WHERE USER_NAME=?";

	public static final String QUERY_SEARCH_GAMES = "SELECT T0.Game_ID,T0.Game_Code,T0.Game_Title,T0.Game_Company,T0.Game_Release_Date,T1.Game_Type_Desc,T0.Game_Installation_Date,Game_Validity_Years,T0.Game_base_price,Game_rating FROM game_details T0 INNER JOIN game_Type_master T1 ON T0.game_Type_ID=T1.Game_Type_ID WHERE  T0.game_title LIKE ? AND T1.Game_Type_Desc LIKE ? AND T0.Game_Company LIKE ? ";

	public static final String QUERY_GET_GAMES_TYPES = "SELECT Game_Type_ID,Game_Type,Game_Type_Desc FROM game_Type_master";

	public static final String QUERY_GET_GAMES_COMPANIES = "SELECT DISTINCT game_company FROM game_details";

	public static final String QUERY_CREATE_NEW_ACCOUNT = "Insert into NEWACCOUNT values(?,?,?,?,?,?,?,?,?,?,?)";

	public static final String QUERY_CREATE_PK = "select max(ACC_NO) from NEWACCOUNT";
	public static final String QUERY_BALANCE_CHECK_ACCOUNT = "select AMOUNT from NEWACCOUNT where ACC_NO=?";

	public static final String QUERY_DEPOSIT_ACCOUNT = "update NEWACCOUNT SET AMOUNT=? where ACC_NO=? and USER_NAME=?";

	public static final String QUERY_WITHDRAW_ACCOUNT = "update NEWACCOUNT SET AMOUNT=? where ACC_NO=? and USER_NAME=?";

	public static final String QUERY_TRANSFER_ACCOUNT = "update NEWACCOUNT SET AMOUNT=? where ACC_NO=?";

	public static final String QUERY_CLOSE_ACCOUNT = "delete from NEWACCOUNT where ACC_NO=? and USER_NAME=?";

	public static final String QUERY_COURSE_CODE = "select COURSE_NAME from COURSE_INFO where COURSE_CODE=?";
	/**
	 * Query String for adding course into the system
	 */
	public static final String QUERY_ADDCOURSE = "Insert into COURSE_INFO values(?,?,?,?)";
	/**
	 * SQL query for inserting into COURSE_FEE table
	 */
	public static final String QUERY_ADDFEES = "Insert into COURSE_FEES values(?,?,?,?)";
	/**
	 * The SQL query string for retrieving the COURSEFEE data from the database
	 */
	public static final String QUERY_FEEMASTER = "Select * from COURSE_FEES_MASTER ";
	/**
	 * Select query for getting the course details from the system
	 */
	public static final String QUERY_RETRICOURSE = "select * from COURSE_INFO t1 inner join COURSE_FEES t2 on t1.COURSE_CODE=t2.COURSE_CODE where t1.COURSE_CODE=?";
	/**
	 * insert query to add batch details
	 */
	public static final String QUERY_ADDBATCH = "insert into BATCH_INFO values(?,?,?,?,?,?,?)";
	/**
	 * Check whether the Batch code already exists or not
	 */
	public static final String QUERY_VBATCOD = "select * from BATCH_INFO where BATCH_CODE =?";

	/**
	 * Select query to verify the medicine code entered by the user
	 */
	public static final String QUERY_MEDICODE = "select * from MEDICINE_MASTER where MEDICINE_CODE =?";

	/**
	 * Query to calculate the Shipping Charge
	 */
	public static final String QUERY_SHP_CHRG = "select SHIPPING_CHARGE from SHIPPING_MASTER where MEDICINE_TYPE_CODE =? and WEIGHT_RANGE =?";
}
