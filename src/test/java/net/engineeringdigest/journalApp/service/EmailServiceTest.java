package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Scheduler.UserScheduler;
import net.engineeringdigest.journalApp.Service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Autowired
    private UserScheduler userScheduler;

    @Test
    public void sendEmailTest(){
         emailService.sendEmail("himanshikhurana100@gmail.com",
                 "testing java mailSender",
                 "hey this side hk!!");
    }

    @Test
    public void tester(){
        userScheduler.fetchUserAndSendSaEmail();
    }
}
