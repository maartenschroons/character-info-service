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

    @Column(name="raceid")
    private String raceid;

    @Column(name="equipmentid")
    private int equipmentid;

    @Column(name="classid")
    private int classid;

    @Column(name="playerid")
    private int playerid;

    @Column(name="name")
    private String name;

    @Column(name="alignment")
    private String alignment;

    @Column(name="strength")
    private int strength;

    @Column(name="dexterity")
    private int dexterity;

    @Column(name="constitution")
    private int constitution;

    @Column(name="wisdom")
    private int wisdom;

    @Column(name="intelligence")
    private int intelligence;

    @Column(name="charisma")
    private int charisma;

}
