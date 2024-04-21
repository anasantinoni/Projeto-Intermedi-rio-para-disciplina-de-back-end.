package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/links")
public class LinkController {

    private final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/{linkId}")
    public ResponseEntity<Link> getLink(@PathVariable String linkId) {
        Link link = linkService.getLinkById(linkId);
        return ResponseEntity.ok(link);
    }

    @PostMapping
    public ResponseEntity<String> createLink(@RequestBody String url) {
        String shortenedLink = linkService.createShortenedLink(url);
        return ResponseEntity.ok(shortenedLink);
    }

    @GetMapping("/ajuda")
    public ResponseEntity<String> getAjuda() {
        String ajuda = "{\"estudante\": \"Ana Júlia Santinoni\", \"projeto\": \"Encurtador de Links\"}";
        return ResponseEntity.ok(ajuda);
    }
}
