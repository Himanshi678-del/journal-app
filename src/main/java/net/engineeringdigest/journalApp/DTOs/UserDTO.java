package net.engineeringdigest.journalApp.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
   @NotBlank
    private String userName;
    private String email;
    private boolean sentimentAnalysis;
    @NotBlank
    private String password;
}
