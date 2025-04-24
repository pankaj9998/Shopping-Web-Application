package com.ecom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

	// ✅ Safe query
	public Optional<UserDtls> findByEmail(String email);

	public List<UserDtls> findByRole(String role);

	public Optional<UserDtls> findByResetToken(String token);

}
