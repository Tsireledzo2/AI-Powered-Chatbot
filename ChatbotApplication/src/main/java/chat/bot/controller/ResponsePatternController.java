package chat.bot.controller;

import chat.bot.models.ResponsePattern;
import chat.bot.models.User;
import chat.bot.service.ResponsePatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/responsePattern")
public class ResponsePatternController {

    @Autowired
    ResponsePatternService responsePatternService;

    @PostMapping("/saveResponse")
    public void create(@RequestBody ResponsePattern responsePattern){
        responsePatternService.saveResponsePattern(responsePattern);
    }

    @GetMapping("/getUser/{responsePatterId}")
    public Optional<ResponsePattern> getUser(@PathVariable UUID responsePatterId){
        return responsePatternService.getPatternById(responsePatterId);
    }

    @PostMapping("/getAllresponse")
    public List<ResponsePattern> getAllresponse(){
        return responsePatternService.getAllPatterns();
    }

    @DeleteMapping("/deleteResponse/{responsePatterId}")
    public void deleteUser(@PathVariable UUID responsePatterId){
        responsePatternService.deletePattern(responsePatterId);
    }
}
