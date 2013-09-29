package hello.service;

import org.springframework.stereotype.Service;

@Service
public class SecureService implements ISecureService {

	@Override
	public String secureId() {
		return "secure";
	}

}
