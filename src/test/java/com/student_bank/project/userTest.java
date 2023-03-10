package com.student_bank.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.student_bank.project.classes.model.User;

public class userTest {

	private User createDefaultUser() {
		MockDatabase m = new MockDatabase();
		User u = new User();
		m.createUser(u);
		return m.getUser();
	}

	@Test
	public void checkCredEncode() {
		User u = createDefaultUser();
		assertEquals(u.credEncode(), "YWRlQWRlQDEyNTA=");
	}
	
	@Test
	public void checkUserNameValid() {
		User u = createDefaultUser();
		assertEquals(u.getUsername(), "Adedeji");
	}
	
	@Test
	public void checkUserAccBalString() {

		User u = createDefaultUser();
		assertEquals(u.getAccountNo(), "2345");
	}

}
