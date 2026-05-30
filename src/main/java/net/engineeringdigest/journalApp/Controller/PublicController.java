package net.engineeringdigest.journalApp.Controller;


import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Service.UserService;
import net.engineeringdigest.journalApp.Service.UserServiceDetailsImpl;
import net.engineeringdigest.journalApp.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
@Slf4j
public class PublicController {
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserServiceDetailsImpl userServiceDetails;

    @Autowired
    private JwtUtils jwtUtil;

    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }


    @PostMapping("/signup")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
            UserDetails userDetails = userServiceDetails.loadUserByUsername(user.getUserName());
            String jwt = jwtUtil.generateToken(userDetails.getUsername());
            return new ResponseEntity<>(jwt, HttpStatus.OK);
        }catch (Exception e){
            log.error("exception occurred during authentication ",e);
            return new ResponseEntity<>("Incorrect username & pwd",HttpStatus.BAD_REQUEST);
        }


    }
}
