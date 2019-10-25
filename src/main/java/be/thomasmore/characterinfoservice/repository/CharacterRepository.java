package be.thomasmore.characterinfoservice.repository;

import be.thomasmore.characterinfoservice.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CharacterRepository extends JpaRepository<Character, Integer>{
    Character findCharacterByName(@Param("name") String name);
}
