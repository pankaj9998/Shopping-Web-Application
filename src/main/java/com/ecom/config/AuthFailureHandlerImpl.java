package com.ecom.config;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.ecom.model.UserDtls;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;
import com.ecom.util.AppConstant;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthFailureHandlerImpl extends SimpleUrlAuthenticationFailureHandler {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		String email = request.getParameter("username");

		Optional<UserDtls> optionalUser = userRepository.findByEmail(email);

		if (optionalUser.isPresent()) {
			UserDtls userDtls = optionalUser.get();

			if (userDtls.getIsEnable()) {

				if (userDtls.getAccountNonLocked()) {
					if (userDtls.getFailedAttempt() < AppConstant.ATTEMPT_TIME - 1) {
						userService.increaseFailedAttempt(userDtls);
					} else {
						userService.userAccountLock(userDtls);
						exception = new LockedException("Your account is locked due to 3 failed attempts.");
					}
				} else {
					if (userService.unlockAccountTimeExpired(userDtls)) {
						exception = new LockedException("Your account is now unlocked. Please try to login again.");
					} else {
						exception = new LockedException("Your account is still locked. Please try again later.");
					}
				}

			} else {
				exception = new LockedException("Your account is inactive.");
			}

		} else {
			exception = new LockedException("Invalid email or password.");
		}

		super.setDefaultFailureUrl("/signin?error");
		super.onAuthenticationFailure(request, response, exception);
	}
}
