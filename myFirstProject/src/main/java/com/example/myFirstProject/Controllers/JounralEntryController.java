package com.example.myFirstProject.Controllers;

import com.example.myFirstProject.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JounralEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap();

    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean  createEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("/{id}")
    public JournalEntry getEntry(@PathVariable long id) {
        return journalEntries.get(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEntry(@PathVariable long id) {
        journalEntries.remove(id);
        return true;
    }

    @PutMapping("/{id}")
    public JournalEntry updateEntry(@PathVariable long id, @RequestBody JournalEntry myEntry) {
            return journalEntries.put(id, myEntry);
    }
}
