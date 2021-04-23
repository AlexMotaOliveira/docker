package br.com.uniciv.testapi.entity;

import org.springframework.data.annotation.Id;

import java.util.UUID;


public class Message {

    @Id
    private UUID id;

    private String message;

    public String getMessage() {
        return message;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
