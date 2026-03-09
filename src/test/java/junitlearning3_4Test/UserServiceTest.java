package junitlearning3_4Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	
//	@Mock
//	private UserRepository userRepository;
//	
//	@InjectMocks
//	private UserService userService;
//	
	
	@Test
	public void test1() {
		
		UserRepository userRepository = Mockito.mock(UserRepository.class);
		UserService userService = new UserService(userRepository);
		
		Mockito.when(userRepository.findUserById(1)).thenReturn("John");
		
		String result = userService.getUserGreeting(1);
		
		assertEquals("Hello, John!",result);
	}
	

}
