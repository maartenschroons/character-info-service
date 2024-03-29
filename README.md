# Character info Microservice

De Microservice charachter-info gaan we gebruiken voor het bewaren van de statestieken van een character. Deze zullen we uit een externe API gaan halen, namelijk de [D&D 5e API](http://www.dnd5eapi.co/)

## Gegevens

In de character-info zullen we de volgende parameters gaan opslaan:

```bash
id
name
raceid
equipmentid
classid
playerid
aligment
strength
dexterity
constitution
intelligence
wisdom
charisma
```

# Algemeen

## Thema
Onze applicatie zal spelers van het spel Dungeons and Dragons de mogelijkheid geven om een overzicht te geven van de bestaande characters in het spel. We geven spelers ook de mogelijk om zelf een character aan te maken. zo kunnen ze makkeijk kiezen uit alle bestaande Classes, Races en Alignments.


## Teamleden

* Maarten Michiels
* Maartens Schroons
* Jelle Van Langendonck
* Din Vanwezemael


## Andere services

* [Player info](https://github.com/DinVanwezemael/DungeonsAndDragons-PlayerInfo)
* [Character Info](https://github.com/maartenschroons/character-info-service)
* [Race](https://github.com/JelleVLD/DungeonsAndDragons-RaceService)

* [Edge Service](https://github.com/maartenschroons/D-D-edge-service)
* [Eureka Service](https://github.com/DinVanwezemael/DungeonsAndDragons-EurekaServer)
* [Zuul Gateway](https://github.com/JelleVLD/ZuulGateway)
* [Authentcation Service](https://github.com/JelleVLD/AuthenticationService)

## Models
Race
```bash
id
name
speed
size
abilityBonuses
```

Player
```bash
id
username
firstname
lastname
password
email
```

Class
```bash
id
name
hit_die
proficiencies
spellcasting
```

Equipment
```bash
id
name
type
subtype
weaponRange
WeaponCategory
damage
cost
weight
```

Character
```bash
id
name
raceid
equipmentid
classid
playerid
aligment
strength
dexterity
constitution
intelligence
wisdom
charisma
```

## Race-controller
![race-controller](https://dinvanwezemael.space/java/race-controller.png)

## Player-controller
![player-controller](https://dinvanwezemael.space/java/player-controller.png)

## Character-controller
![character-controller](https://dinvanwezemael.space/java/character-controller.png)

## Front-end
We hebben gebruik gemaakt van Angular om de font-end te realiseren, we hebben hiervoor gekozen omdat dit een zeer populair framework is en nog steeds aan het groeien is. Ook bied Angular de mogelijkheid om onze applicatie mobile te maken.

## Extra info
aangezien we met de externe API [D&D 5e API](http://www.dnd5eapi.co/) werken is het nodig om de plugin [Moesif CORS](https://chrome.google.com/webstore/detail/moesif-orign-cors-changer/digfbfaphojjndkpccljibejjbppifbc) te installeren en als browser Google Chrome te gebruiken.

