package chat.bot.controller;

import chat.bot.models.Intent;
import chat.bot.service.IntentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/intent")
public class IntentController {

    @Autowired
    IntentService intentService;

    @PostMapping("/savedIntent")
    public void saveIntent(@RequestBody Intent intent){
        intentService.saveIntent(intent);
    }

    @GetMapping("/getIntent/{intentId}")
    public Optional<Intent> getIntent(@PathVariable UUID intentId){
        return intentService.getIntentById(intentId);
    }

    @PostMapping("/getAllUser")
    public List<Intent> getAllUsers(){
        return intentService.getAllIntents();
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable UUID userId){
        intentService.deleteIntent(userId);
    }
}
