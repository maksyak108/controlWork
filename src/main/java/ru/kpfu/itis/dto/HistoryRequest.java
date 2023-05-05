package ru.kpfu.itis.dto;

import ru.kpfu.itis.model.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "history")
public class HistoryRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date")
    private LocalDateTime date;
    public HistoryRequest() {
        this.date = LocalDateTime.now();
    }

    public HistoryRequest(String city, User user) {
        this.city = city;
        this.user = user;
        this.date = LocalDateTime.now();
    }

}

