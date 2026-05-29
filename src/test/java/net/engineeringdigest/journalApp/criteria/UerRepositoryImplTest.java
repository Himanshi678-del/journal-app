package net.engineeringdigest.journalApp.criteria;

import net.engineeringdigest.journalApp.Repository.UserRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UerRepositoryImplTest {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    public void testing(){
        Assertions.assertNotNull(userRepository.getUserForSA());
    }
}
