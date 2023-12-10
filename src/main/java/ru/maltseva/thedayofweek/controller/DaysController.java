package ru.maltseva.thedayofweek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maltseva.thedayofweek.model.service.DaysManager;

@RestController
@RequestMapping
public class DaysController {

    @GetMapping("/getDay")
    public String getDay() {
        return String.format("Сегодня %s!", DaysManager.getDayFromConsole().getDAY_OF_WEEK());
    }
}
