package idv.laborLab.userservice.dto;

import java.time.LocalDate;

public record UserDTO(String userName, String firstName, String lastName, String email,
                      String phoneNumber, LocalDate dateOfBirth) {

}
