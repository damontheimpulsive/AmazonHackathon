package com.amazon.constants;

/**
 * Contains the constants to be used for the login application
 * 
 * @author t-Renjith
 * 
 */
public final class ErrorConstants {

	private ErrorConstants() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The error message property file
	 */
	public static final String ERRORMESSAGES = "errormessages";

	/**
	 * The error message property file for Pharma
	 */
	public static final String PHARMAERRORMSG = "phmessages";
	
	public static final String CLOSEPAGE = "closeac1.jsp";

	/**
	 * The login page
	 */
	public static final String BALANCEPAGE = "balance1.jsp";
	public static final String WITHDRAWPAGE = "withdraw1.jsp";
	
	public static final String LOGINPAGE = "login.jsp";
	public static final String TRANSFERPAGE = "transfer1.jsp";
	public static final String DEPOSITPAGE = "deposit1.jsp";
	/**
	 * 
	 */
	public static final String ADMINPAGE = "adminhome.jsp";
	/**
	 * The add course page
	 */
	public static final String ADDCOURSE = "addCourse.jsp";
	/**
	 * The error page which is to be shown on fatal errors
	 */
	public static final String ERRORPAGE = "error.jsp";
	/**
	 * The error code for fatal error
	 */
	public static final String FATALERROR = "500";
	/**
	 * Error message key for invalid user
	 */

	public static final String INVALIDUSERNAME = "510";
	/**
	 * Error message key for invalid password
	 */
	public static final String INVALIDPASSWORD = "511";
	/**
	 * The error message key for empty course name
	 */
	public static final String COURSE_NAME_EMPTY = "520";
	/**
	 * The error message key for empty course duration empty
	 */
	public static final String DURATION_EMPTY = "521";
	/**
	 * The error message key for empty course description
	 */
	public static final String DESCRIPTION_EMPTY = "522";
	/**
	 * The error message key for empty course type
	 */
	public static final String COURSE_TYPE_EMPTY = "523";
	/**
	 * The error message key for null course code
	 */
	public static final String COURSE_CODE_NULL = "524";
	/**
	 * The error message key for invalid course code
	 */
	public static final String INVALID_COURSE_CD = "525";
	/**
	 * The error message key for invalid course code format
	 */
	public static final String COURSE_CODE_FMT = "526";
	/**
	 * The error message key for no data for the entered course code
	 */
	public static final String CODE_NODATA = "527";
	/**
	 * The error message key for non integer course code
	 */
	public static final String COURSE_STREGTH = "528";
	/**
	 * Error message key for course code already exists
	 */
	public static final String COURSE_EXISTS = "501";

	/**
	 * Error message key for batch code already exists
	 */
	public static final String BATCH_EXISTS = "511";

	/**
	 * Error message key for Invalid Medicine code
	 */
	public static final String INVALID_MEDI_CD = "510";

	/**
	 * Error message key for Weight less than 100
	 */
	public static final String INVALID_WEIGHT = "512";

	/**
	 * Error message key for Invalid Batch Code
	 */
	public static final String INVALID_BATCH_CD = "513";

	/**
	 * Error message will be diverted to addbatch.jsp
	 */
	public static final String EBATCHPAGE = "addbatch.jsp";

}
