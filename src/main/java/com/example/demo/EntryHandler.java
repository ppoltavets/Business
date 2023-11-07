package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.sql.SQLException;

@RestController
@RequestMapping("/entry")
public class EntryHandler {
    @GetMapping()
    public static String getEntry() throws SQLException {
        CalcEntryParams entryParams = new CalcEntryParams();
        DatabaseHandler dbHandler = new DatabaseHandler();
        DatabaseHandler.getRow(null);
        DatabaseHandler.addRow("550e8400-e29b-41d4-a716-446655440000","chaur");
        return "Entry: " + entryParams.CalcEntry(1000, 2000, 3000, 4000);
    }

    @GetMapping("/test")
    public String getTest() {
        return "Healthckeck: OK";
    }
}
