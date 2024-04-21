package org.example;

import org.springframework.stereotype.Service;

@Service
public class LinkService {

    public Link getLinkById(String linkId) {
        return new Link("abcd123", "http://linkoriginal.com");
    }

    public String createShortenedLink(String url) {
        return "http://linkencurtado.com/abcd123";
    }
}
