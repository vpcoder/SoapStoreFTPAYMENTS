package ru.diasoft.nblond.repo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.keyvalue.annotation.KeySpace;

import javax.persistence.*;

@KeySpace("request")
@NoArgsConstructor
@Data
@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "method", nullable = false)
    private String method;

    @Column(name = "user_id", nullable = false)
    private long user;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "body", nullable = false)
    private String body;

}
