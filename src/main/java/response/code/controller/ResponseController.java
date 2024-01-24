package response.code.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Student1")
public class ResponseController
{
    @GetMapping("/success")
    public ResponseEntity<String> success() {
        return new ResponseEntity<>("Operation successful! -> 200 http response code", HttpStatus.OK);
    }

    @GetMapping("/not_found")
    public ResponseEntity<String> notFound() {
        return new ResponseEntity<>("Resource not found! -> 404 http response code", HttpStatus.NOT_FOUND);
    }

    @PostMapping("/created")
    public ResponseEntity<String> created(@RequestBody String requestPayload) {

        return new ResponseEntity<>("Resource created successfully! --> 201 http response code", HttpStatus.CREATED);
    }

    @PutMapping("/updated")
    public ResponseEntity<String> updated(@RequestBody String requestPayload) {

        return new ResponseEntity<>("Resource updated successfully! -> 200 http response code", HttpStatus.OK);
    }

    @DeleteMapping("/deleted")
    public ResponseEntity<String> deleted() {

        return new ResponseEntity<>("Resource deleted successfully! -> 204 http response code", HttpStatus.NO_CONTENT);
    }

    @GetMapping("/servererror")
    public ResponseEntity<String> serverError() {

        return new ResponseEntity<>("Internal Server Error! -> 500 http response code",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
