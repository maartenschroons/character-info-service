package be.thomasmore.characterinfoservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="character")
@Data
@NoArgsConstructor
public class Character {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="raceId")
    private int raceId;

    @Column(name="equipmentId")
    private int equipment;

    @Column(name="classId")
    private int classId;

    @Column(name="playerId")
    private int playerId;

    @Column(name="name")
    private String name;

    @Column(name="alignment")
    private String alignment;

    @Column(name="strenght")
    private int Strenght;

    @Column(name="dexterity")
    private int Dexterity;

    @Column(name="conjuring")
    private int conjuring;

    @Column(name="wisdom")
    private int wisdom;

    @Column(name="intelligence")
    private int intelligence;

    @Column(name="charisma")
    private int charisma;

}
