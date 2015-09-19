package com.amazon.bo;

import com.amazon.constants.ErrorConstants;
import com.amazon.dao.LoginDAO;
import com.amazon.exception.LoginBusinessException;
import com.amazon.exception.LoginException;
import com.amazon.util.PropertyUtil;
import com.amazon.vo.LoginVO;

public class LoginBO {

	public LoginVO validateUser(final LoginVO user)
			throws LoginBusinessException, LoginException {

		String message = null;
		LoginVO login = new LoginVO();
		final LoginDAO userdao = new LoginDAO();
		// int flag = 0;

		login = userdao.getUserDetails(user);

		if (login.getFlag() == 0) {
			message = PropertyUtil
					.getErrorMessage(ErrorConstants.INVALIDUSERNAME);

			throw new LoginBusinessException(message);
		} else if (login.getFlag() == 1) {
			message = PropertyUtil
					.getErrorMessage(ErrorConstants.INVALIDPASSWORD);

			throw new LoginBusinessException(message);
		}
		return login;
	}

}
