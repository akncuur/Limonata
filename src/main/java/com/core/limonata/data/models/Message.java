package com.core.limonata.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String data;

    public Message() {}
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }
    public String getData() { return this.data; }
    public void setData(String data) { this.data = data; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(this.id, message.id) && Objects.equals(this.data, message.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.data);
    }

    @Override
    public String toString() {
        return String.format("Message{id='%d', data='%s'}", this.id, this.data);
    }
}
