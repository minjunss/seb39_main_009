package teamparkinglot.parkinggo.config.secret;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class SecretCode {

    @Value("${jwt.tokenSecurityKey}")
    private String tokenSecurityKey;

    @Value("${jwt.accessTokenExpireTime}")
    private Long accessTokenExpireTime;

    @Value("${jwt.refreshTokenExpireTime}")
    private Long refreshTokenExpireTime;

    @Value("qaapdSgtsecMfGukTkoFntQjf7g%2Bpzn9xBcRiZPnpeZ%2BcZsKpAqfpFYl3IYwCyfL9C5UIDHEUS92UatDkujH7g%3D%3D")
    private String parkingOpenApiEncodingKey;

}
