package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Repository.UserRepo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepo userRepo;


   @ParameterizedTest
   @ValueSource(strings={
           "sia",
           "lia",

   })
    public void testAdd(String name){
       assertNotNull(userRepo.findByUserName(name),"failed for : "+name);
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,1,3",
            "7,5,6"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }
}
