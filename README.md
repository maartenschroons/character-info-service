# character-info Microservice

De Microservice charachter-info gaan we gebruiken voor het bewaren van de statestieken van een character. Deze zullen we uit een externe API gaan halen, namelijk de [D&D 5e API](http://www.dnd5eapi.co/)

## Gegevens

In de character-info zullen we de volgende parameters gaan opslaan:

```bash
id
username
raceId
equipmentId
classId
playerId
name
alignment
strenght
dexterity
consitution
wisdom
intelligence
charisma
```

## Andere services

### Mircoservices

#### player-info
[player-info](https://github.com/DinVanwezemael/DungeonsAndDragons-PlayerInfo)
#### character-info
[character-info](https://github.com/maartenschroons/character-info-service)
#### race
[race](https://github.com/JelleVLD/DungeonsAndDragons-RaceService)


### Andere


#### Edge Service
[Edge Service](https://github.com/maartenschroons/D-D-edge-service)
#### Eureka Service
[Eureka Service](https://github.com/DinVanwezemael/DungeonsAndDragons-EurekaServer)
#### Zull Gateway
[Zuul Gateway](https://github.com/JelleVLD/ZuulGateway)
