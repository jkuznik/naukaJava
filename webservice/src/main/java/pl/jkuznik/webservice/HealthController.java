package pl.jkuznik.webservice;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("health")
    public ResponseEntity<ApplicationStatus> getHealth(){

        ApplicationStatus status = new ApplicationStatus(1);

        return ResponseEntity.ok(status);
    }
}
