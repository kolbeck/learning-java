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
        return ResponseEntity.ok()
	      .header("Access-Control-Allow-Origin", "http://localhost:3000")
	      .body(createStaticResponse());
    }

    private ItemsResponse createStaticResponse() {
        var r = new ItemsResponse();
        for(var i = 0; i < 3; i++)
            r.addItemsItem(createStaticItem((i + 1) + ""));

        return r;
    }

    private Item createStaticItem(String id) {
        var i = new Item();
        i.setId(id);
        i.setTitle("This Is Fantastic");
        i.setDescription("And by fantastic we mean great.");
        i.setImageUrl("https://picsum.photos/600/400");
        return i;
    }
}
