package ru.kpfu.itis.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.dto.HistoryRequest;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.HistoryRepository;

import java.util.List;

@Service
public class HistoryService {

    private final HistoryRepository historyRepository;

    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    public void addRequest(String city, User user) {
        HistoryRequest request = new HistoryRequest(city, user);
        historyRepository.save(request);
    }

    public List<HistoryRequest> getRequestsByUser(User user) {
        return historyRepository.findByUserOrderByDateDesc(user);
    }

}

