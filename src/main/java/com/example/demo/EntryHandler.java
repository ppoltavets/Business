package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryHandler {
    @GetMapping()
    public static String getEntry() {
        CalcEntryParams entryParams = new CalcEntryParams();
        return "Entry: " + entryParams.CalcEntry(1000, 2000, 3000, 4000);
    }

    @GetMapping("/test")
    public String getTest() {
        return "Healthckeck: OK";
    }
}
