package idv.laborLab.userService.entity;

import idv.laborLab.sharedLibrary.objects.UserRegistrationSO;
import idv.laborLab.sharedLibrary.objects.UserSecurityInfoSO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_security_info",
        indexes = {
                @Index(name = "user_id", columnList = "userId")
        })
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSecurityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private byte[] passwordByte;
    private long userId;    // one to one with user entity

    public static UserSecurityInfo buildFromUserRegistrationSO(UserRegistrationSO userRegistrationSO) {

        UserSecurityInfoSO userSecurityInfoSO = userRegistrationSO.getUserSecurityInfoSO();

        return UserSecurityInfo.builder()
                               .id(0)
                               .userId(userSecurityInfoSO.getUserId())
                               .passwordByte(userSecurityInfoSO.getPasswordByte())
                               .build();
    }
}
