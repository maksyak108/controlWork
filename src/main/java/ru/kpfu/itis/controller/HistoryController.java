package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.dto.HistoryRequest;
import ru.kpfu.itis.filter.JwtAuthentication;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.service.HistoryService;

import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryController {

    private HistoryService historyService;

    @Autowired
    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping("/")
    public List<HistoryRequest> getUserHistory(JwtAuthentication principal) {
        String username = ((UserDetails) principal.getPrincipal()).getUsername();
        User user = User.builder()
                .name(username)
                .build();
        return historyService.getRequestsByUser(user);
    }

}
