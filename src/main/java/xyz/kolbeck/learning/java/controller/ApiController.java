package xyz.kolbeck.learning.java.controller;

import java.util.LinkedList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.kolbeck.learning.java.gen.item.model.Item;
import xyz.kolbeck.learning.java.gen.item.model.ItemsResponse;

@RestController("/")
public class ApiController {
    @GetMapping("/")
    public ResponseEntity<ItemsResponse> getItems() {
        ItemsResponse r = new ItemsResponse();
        r.setItems(new LinkedList<Item>());
        return ResponseEntity.ok(r);
    }
}
