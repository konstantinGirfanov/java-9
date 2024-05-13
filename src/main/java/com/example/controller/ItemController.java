package com.example.controller;

import net.minidev.json.JSONObject;
import com.example.model.Item;
import com.example.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @PostMapping("/list")
    public HttpStatus createItem(@RequestBody JSONObject object)
    {
        itemService.addProduct(object.getAsString("name"));
        return HttpStatus.OK;
    }

    @GetMapping("/list")
    public Iterable<Item> getAll() { return itemService.getAll(); }

    @PutMapping("/list/{id}")
    public HttpStatus checkItem(@PathVariable int id)
    {
        itemService.checkItem(id);
        return HttpStatus.OK;
    }

    @DeleteMapping("/list/{id}")
    public HttpStatus deleteItem(@PathVariable int id)
    {
        itemService.deleteItem(id);
        return HttpStatus.OK;
    }
}