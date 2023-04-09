package by.teachmeskills.api.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private UserData data;
    private UserSupport support;
}
