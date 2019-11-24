package be.thomasmore.characterinfoservice.repository;

import be.thomasmore.characterinfoservice.entity.Character;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin
@Repository
@RepositoryRestResource(path = "characters")
public interface CharacterRepository extends JpaRepository<Character, Integer> {
    Character findCharacterById(@Param("id") Integer id);
    List<Character> findCharactersByPlayeridOrderByName(@Param("playerid") Integer playerid);
    List<Character> findAllByNameNotNull();
}
// http://localhost:8002/characters/search/findCharacterById?id=1
// http://localhost:8002/characters/search/findCharactersByPlayeridOrderByName?playerid=1
// http://localhost:8002/characters/search/findAllByNameNotNull

