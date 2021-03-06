package com.medviv.auth.service;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.testng.annotations.Test;

import com.medviv.auth.model.UserAccount;

public class UserDetailsServiceTest extends BaseSpringTest {
    @Autowired
    private UserDetailsService service;

    @Test
    public void testNotNull() {
        assertNotNull(service);
    }

    @Test
    public void testLoadUser() {
        final UserAccount account = (UserAccount) service.loadUserByUsername("tom@gmail.com");
        assertNotNull(account);
    }

    @Test(expectedExceptions = UsernameNotFoundException.class)
    public void testLoadUserException() {
        final UserAccount account = (UserAccount) service.loadUserByUsername("xywww@gmail.com");
        assertNull(account);
    }
}