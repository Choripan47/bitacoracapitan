package cl.mallea.bitacoraCapitan;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentoController {

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<?> getDocument(){
        return ResponseEntity.ok("Hola"); //test
    }
}
