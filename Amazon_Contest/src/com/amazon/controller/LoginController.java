package com.amazon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amazon.bo.LoginBO;
import com.amazon.constants.ErrorConstants;
import com.amazon.constants.SuccessConstants;
import com.amazon.exception.LoginBusinessException;
import com.amazon.exception.LoginException;
import com.amazon.util.PropertyUtil;
import com.amazon.vo.LoginVO;

public class LoginController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Anuj");
		super.init();
	}

	private static final long serialVersionUID = 1L;

	protected void doGet(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
		System.out.println("Inside controller");
		LoginVO user = new LoginVO();
		// LoginVO login=new LoginVO();
		final String userName = request.getParameter("username");
		
		final String passWord = request.getParameter("password");
		System.out.println("userName " + userName);
		System.out.println("Password " + passWord);
		user.setUsername(userName);
		user.setPassword(passWord);

		final LoginBO logic = new LoginBO();
		try {
			user = logic.validateUser(user);
			final HttpSession session = request.getSession();
			session.setAttribute("username", userName);
			// session.setAttribute("Role", user.getRole());
			/*
			 * if (user.getRole() == 1) { request.setAttribute( "message",
			 * PropertyUtil
			 * .getSuccessMessage(SuccessConstants.ADMIN_LOGIN_SUCCESS)); final
			 * RequestDispatcher dispatcher = request
			 * .getRequestDispatcher(SuccessConstants.ADMIN_SUCCESS_PAGE);
			 * dispatcher.forward(request, response); } else if (user.getRole()
			 * == 2) { request.setAttribute( "message", PropertyUtil
			 * .getSuccessMessage(SuccessConstants.PLAYER_LOGIN_SUCCESS)); final
			 * RequestDispatcher dispatcher = request
			 * .getRequestDispatcher(SuccessConstants.PLAYER_SUCCESS_PAGE);
			 * dispatcher.forward(request, response); }
			 */

			request.setAttribute("message", PropertyUtil
					.getSuccessMessage(SuccessConstants.ADMIN_LOGIN_SUCCESS));
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher(SuccessConstants.ADMIN_SUCCESS_PAGE);
			dispatcher.forward(request, response);

		} catch (LoginBusinessException e) {
			request.setAttribute("message", e.getMessage());
			final RequestDispatcher loginDispatcher = request
					.getRequestDispatcher(ErrorConstants.LOGINPAGE);
			loginDispatcher.forward(request, response);
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			request.setAttribute("message",
					PropertyUtil.getErrorMessage(ErrorConstants.FATALERROR));
			final RequestDispatcher loginDispatcher = request
					.getRequestDispatcher(ErrorConstants.ERRORPAGE);
			loginDispatcher.forward(request, response);
		}

	}
}