package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.dto.HistoryRequest;
import ru.kpfu.itis.model.User;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryRequest, Long> {

    List<HistoryRequest> findByUserOrderByDateDesc(User user);

}
