package teamparkinglot.parkinggo.health_check;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/hihi")
@RequiredArgsConstructor
public class OpenApiController {

    private final ApiExplorer apiExplorer;

    @PostMapping
    public ResponseEntity test(@RequestBody Test test) {


        try {
            String sss = apiExplorer.searchFromApi(test.getTest());
            return new ResponseEntity<>(sss, HttpStatus.OK);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
