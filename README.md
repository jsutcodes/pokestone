# pokestone
 Create a for fun pokemon hearthstone inspired game. 
 
## Trainers (Pokemon player class)
 * trainers have a starter pokemon with them at all time, that does their Propose power 
 * Legandary Pokemon (Or dark legendaries) Can take over a trainer and their power? plainswalker?? i.e. (Mewtwo, giovanni? mad scientist? or extinct pokemon?) 
 * would like 10 roles? 



| Role | Pokemon "Famous" Character | Hearthstone inspiration class | Proposed Power | Starter | 
| -- | -- | -- | --| -- | 
|Nurse | Nurse Joy | Priest | Devout healers with powerful restorative abilities, Priests use the power of Light to sustain themselves and their allies while pacifying enemies, but they can also use their darker abilities to manipulate and destroy enemies, peering into or even seizing control of their opponents' minds. | Chansey Heal by 2 (metronome?? ) |
| Officer | Officer Jenny | paladin |sturdy weapons, gifting divine protection, secrets to protect? | growlithe (summon a 1-1) | 
|Phsychic| Phsycic trainer |mage | Masters of arcane, fire and frost, mages wield formidable single-target and area of effect damage spells, and can freeze enemies in their tracks. Mages have a strong spell-synergy, capable of turning minor incantations into devastating Fireballs, and can employ a range of magical Secrets to redirect enemy effects, protect themselves from damage, or stop the deadliest foe or spell in its tracks. | abra /mr.mime (barrier or dummy doll?)|
| Grunt/Theif| rocket Grunt | Rogue | card draw, take 2 damage |koffing |
|Hiker | | Hunter | |
|Nesters | Day Care Man| Druid | Ditto (Make 1-1 or 0-0 clone of pokemon) |
|Gambler |  | Shaman| Willing to risk it to overload to rise in the moment| one hit ko style or confusion, thrash? hitmonlee/chan|
|Blackbelt | | warrior|   |
|Bird Keeper | | warlock| |
|Bird Keeper | | | |

```
Trainer class (Generation 1)
=============
Beauty
Biker
Bird Keeper
Blackbelt
Boss*
Bug Catcher
Burglar
Champion*
Channeler
Cooltrainer
Cue Ball
Elite Four*
Engineer
Fisherman
Gambler
Gentleman
Hiker
Jr. Trainer♂
Jr. Trainer♀
Juggler
Lass
Leader*
PokéManiac
Psychic
Rival*
Rocker
Rocket
Sailor
Scientist
Super Nerd
Swimmer
Tamer
Youngster
```


## GameModes (In order of difficulty creating)
- PvP - local Computer (Take on premade Trainers & rivals)  --Once you defaeat them unlock their trainer card!!
- League challenge (Take on the 8 gym leaders and elite four) --Once you defaeat them unlock their trainer card!!
- PVP - local
- PvP - Online play 

## How do the (pokemon) cards work? 
Types of cards:
1. Spells (TM, HM, moves -- TMs will have a list of types that can cast it Legendary can only be cast by that one type i.e. -- eatrthquake a ground only attack?)
2. Pokemon (cost, type, effect, Power, Hit points) can have duel types
3. Items (Escape rope, smokebomb, berries etc)
  - (berries are like secrets, 1 time use opponent doesnt know about them.)
5. Status (Burn, poisoned, cursed, paralysis?)
6. cards will be uniquely identifiable by card type, card id, card version (for example POKEMON-001-0)
Deck Rules: 
- 2 card limit of any pokemon type
- 30 card deck 
- legendary can only be in the deck 1 time (Limit this to only 5 per deck?)

| Pokemon Types | General card rules| Effects:| 
|--|--|--|
|Bug| weak but grow in numbers (paladin ideas)| fury cut|
|Dragon| Strong attack and defence but expensive| hyper beam|
|Electric| Attack right away | quick attack, paralyze (% chance to paralyze when attacked) |
|Fighting| strong attack or defense but not both OR can attack right away| final stand (get +1+1 when an ally dies) |
|Fire| vegance style, deatheffects, status afflictions, strong attack?| burn-on-death double attack?|
|Flying| Count as normal, can avoid taunts?| fly,|
|Ghost| can only be attacked after they attack once, ||
|Grass| ||
|Ground| big defense, | grounded (cannot be affected by opposing item cards)|
|Normal| little mix of everything| |
|Poison| status afflictions, very weak and cheaper cost| confusion, fear,|
|Psychic| ||
|Rock| big defense or low with sturdy | sturdy (survive a fatal hit by 1)|
|Water| ||

Future Additions of cards:

| Pokemon Types | Trainers Specific| | 
|--|--|--|
|Fairy| affect other cards health, status cures, etc ||
|Dark| ||
|Ice| ||
|Steel|| |


|num | Gym Speciality | Leader|
| -- | --| --| 
|1| rock | Brock | 
|2| water | Misty | 
|3| electric | Lt. Surge | 
|4| grass | Erika | 
|5| poison | Koga | 
|6| Psychic |  Sabrina|
|7| Fire | Blaine | 
|8| Ground | Giovanni | 
|Elite 1| Ice | Lorelei | 
|Elite 2| Fighting | Bruno | 
|Elite 3| Ghost | Agatha | 
|Elite 4| Dragon | Lance | 
|League Champ | Mixed | Blue | 


### Getting started: 
- Create a simple sping boot project for viewing the cards info stored in json or database (dev tool)
- add an UI component
- Use this tool to edit and create cards and save to the database.  

### Part 2: 
-Create the game

