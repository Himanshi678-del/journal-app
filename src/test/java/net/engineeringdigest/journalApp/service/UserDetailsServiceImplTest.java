package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Repository.UserRepo;
import net.engineeringdigest.journalApp.Service.UserServiceDetailsImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;

import static org.mockito.Mockito.*;


public class UserDetailsServiceImplTest {

    @InjectMocks
    private UserServiceDetailsImpl userServiceDetails;

    @Mock
    private UserRepo userRepo;

     @BeforeEach void setup(){
         MockitoAnnotations.initMocks(this);
     }

    @Test
    void loadUserByUsernameTest(){
        when(userRepo.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("sia").password("bdcb").roles(new ArrayList<>()).build());
        UserDetails user = userServiceDetails.loadUserByUsername("sia");
        Assertions.assertNotNull(user);
    }
}
