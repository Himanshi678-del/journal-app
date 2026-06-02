package net.engineeringdigest.journalApp.Service;

import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.DTOs.UserDTO;
import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Repository.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private final PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    private User mapToUser(UserDTO dto){
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setEmail(dto.getEmail());
        user.setSentimentAnalysis(dto.isSentimentAnalysis());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        return user;
    }

    public List<User> getAll(){
        return userRepo.findAll();
    }

    public void saveNewUser(UserDTO userDTO) {
        try {
            User user = mapToUser(userDTO);
            user.setRoles(Arrays.asList("USER"));
            userRepo.save(user);

        } catch (Exception e) {
            log.error("error for {} :", userDTO.getUserName(), e);
        }
    }

        public void saveAdmin(UserDTO userDTO){

            User user = mapToUser(userDTO);
            user.setRoles(Arrays.asList("ADMIN","USER"));
            userRepo.save(user);
        }


    public void saveUser(User user){
        userRepo.save(user);

    }

    public Optional<User> findById(ObjectId id){
       return userRepo.findById(id);
    }

    public void DeleteById(ObjectId id){
         userRepo.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepo.findByUserName(userName);
    }


}
