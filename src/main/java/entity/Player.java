package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    @Column (name = "id")
    private Integer id;
    @Column (name = "name", nullable = false, length = 255)
    private String name;

    public Player() {}

    public Player(String name) {
        this.id = null;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
