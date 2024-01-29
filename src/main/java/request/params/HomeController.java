package request.params;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/param")
public class HomeController
{
    //@RequestParam are used to send data to the server as part of the URL in an HTTP request.
    //Usage: Commonly used for filtering, sorting, or specifying criteria for the requested resource.
    @GetMapping("/request")
    public String getUsers(@RequestParam String name, @RequestParam(defaultValue = "21") int age)
    {
        return "My name is "+name+". I am "+age+" year's old";
    }
    //@RequestHeaders are used to send additional information in the HTTP header of a request.
    //Usage: Provides metadata about the request, such as authentication tokens, content type, or encoding.
    @GetMapping("/header")
    public String handleRequestHeader(@RequestHeader String authorization)
    {
        System.out.println("Printing the "+authorization);
        return "Success";
    }
    //@Response Headers Used to convey additional information in the HTTP header of a response from the server.
    //Usage: Provides metadata about the response, such as content type, cache control directives, or server information.
    @GetMapping("/response")
    public ResponseEntity<?> getResponse() {
        // Dummy response data
        String resourceData = "{\"id\": 123, \"name\": \"Header Response\"}";

        // Creating a ResponseEntity with the response data and setting custom response headers
        return ResponseEntity.ok()
                .header("My-Header", "Custom Header Value")
                .header("Cache-Control", "no-cache")
                .body(resourceData);
    }
}
