package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajuda")
public class HelpController {

    @GetMapping
    public ResponseEntity<String> getAjuda() {
        String ajuda = "{\"estudante\": \"Ana Júlia Santinoni\", \"projeto\": \"Encurtador de Links\"}";
        return ResponseEntity.ok(ajuda);
    }
}