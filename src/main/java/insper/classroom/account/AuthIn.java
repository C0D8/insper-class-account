package insper.classroom.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder 
@Accessors(chain = true, fluent = true)
public record AuthIn(
    String email,
    String password) {

    
}
