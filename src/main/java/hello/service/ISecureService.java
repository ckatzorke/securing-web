package hello.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface ISecureService {

	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	String secureId();
}
