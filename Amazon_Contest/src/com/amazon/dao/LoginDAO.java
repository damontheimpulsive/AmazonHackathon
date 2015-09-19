package com.amazon.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.amazon.connection.DataManager;
import com.amazon.constants.DataBaseConstants;
import com.amazon.exception.LoginException;
import com.amazon.vo.LoginVO;

public class LoginDAO {

	public LoginVO getUserDetails(final LoginVO user) throws LoginException {

		final String queryString = DataBaseConstants.QUERY_USER_VALID;
		LoginVO login = new LoginVO();
		int response = 0;
		ResultSet result = null;
		DataManager manager = null;

		try {
			
			
			manager = new DataManager();
			manager.createConnection();
			String password;
			final PreparedStatement statement = manager.getConnection().prepareStatement(queryString);
			
			
			System.out.println("user name " + user.getUsername());
			statement.setString(1, user.getUsername());
			result = statement.executeQuery();
			System.out.println("Query Executed");
			while (result.next()) {
				System.out.println(result.getString(1));
				password = result.getString(3);
				if (user.getPassword().equals(password)) {

					response = 2;
					login.setFlag(response);
					System.out.println(result.getString(2));
					login.setPassword(result.getString(3));
					login.setUsername(result.getString(2));
					login.setUserID(result.getString(1));
				} else {
					response = 1;
					login.setFlag(response);
					/*
					 * login.setPassword(result.getString(2));
					 * login.setUsername(result.getString(1));
					 * login.setUserID(result.getString(0));
					 */
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();

			throw new LoginException("SQL Exception happened", e);
		} finally {

			try {
				if (result != null) {

					result.close();
				}
				if (manager.getConnection() != null) {

					manager.getConnection().close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
				// throw new LoginException("SQL Exception happened", e);
			}

		}

		return login;
	}

}
