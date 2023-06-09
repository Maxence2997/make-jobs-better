package idv.laborLab.sharedLibrary.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSecurityInfoSO implements Serializable {

    private long id;
    private byte[] passwordByte;
    private long userId;    // one to one with user entity
}
