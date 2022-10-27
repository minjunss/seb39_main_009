package teamparkinglot.parkinggo.mock_custom_user;


import org.springframework.security.test.context.support.WithSecurityContext;
import teamparkinglot.parkinggo.mock_custom_user.WithMockCustomUserSecurityContextFactory;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithSecurityContext(factory = WithMockCustomUserSecurityContextFactory.class)
public @interface WithMockCustomUser  {

    String username() default "test";
    String name() default "ParkingGoTest";
}
