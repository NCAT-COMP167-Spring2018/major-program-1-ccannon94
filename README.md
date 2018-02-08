# Meteor Blaster
## GEEN 165 Major Program 1 Spring 2018
## Due: Feb. 27, 2018 @ 6:00pm

**READ THESE INSTRUCTIONS THOROUGHLY BEFORE STARTING THE PROJECT**

### Introduction
This program will require you to create classes to support a game similar to the classic title Asteroids.  Basically, the player controls a spacecraft that must destroy approaching meteors with torpedoes before they hit the spacecraft.  After all the meteors are destroyed, the player will progress to the next level where there will be more and potentially faster meteors.  This current assignment will require you to supply configuration and gamer profile data to the GUI portion of the game.

![Figure01](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure1.png)

### UML Class Diagrams

Here are the UML Class Diagrams of the classes you must implement in Java.

#### The toString() Method

Except for the GamerProfile and GamerProfileCollection classes, the toString method of each class should just return a string with each property separated by a "|" character.  If the class has references to other objects as properties, start those properties on a new line (like we did for the MotorPool example in class).

#### Mutator and Accessor Methods

You **must** include the mutator and accessor methods for EVERY property in a class, except the SoundData class. For ArrayLists, see "Handling ArrayLists" in the next section.

![CraftData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure2.png)
![ExplosionData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure3.png)
![MeteorData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure4.png)
![GamerProfile](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure5.png)
![GamerProfileCollection](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure6.png)
![MeteorIO](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure7.png)
![MeteorConfigData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure8.png)
![SoundData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure9.png)

```
public void setSoundResource( int index, String soundFile) {
        URL soundResource = getClass().getResource(soundFile);
        sounds[index] = new AudioClip(soundResource.toString());
}
```

![Level](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure10.png)
![LevelData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure11.png)
![Rank](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure12.png)
![RankData](https://github.com/NCATCS/images/blob/master/Spring2018MP1_Figure13.png)

### Handling ArrayLists

Each ArrayList should have five associated methods to perform: getNum, add, get and set.  So if you have an ArrayList named widgets that stored items of type Widget, then the associated UML would be:

`+getNumWidgets() : int  			//Return the number of items in the ArrayList widgets.`

`+getWidget(index:int) : Widget  			//get the Widget at location index in ArrayList widgets`

`+setWidget(index:int, item:Widget):void	//store item at location index in the ArrayList widgets.1`

`+addWidget(item:Widget):void   		//Append the Widget to the ArrayList. `

`+deleteWidget(index:int) : Widget 		//Remove and return the Widget at location index.`

### Input Files

For testing purposes, the configuration and gamer data input files will be supplied to your main() method using command-line arguments/parameters.   One of your upcoming labs will cover how to use command-line arguments to pass information to your program.   See the included figures for the formats of these files.  Where needed, the data types of values are included with the value description using UML class diagram syntax.  You should look at the actual files to make sure that the format matches up with my description.

#### Input File Format

```
0, pointsNeeded, rank0Name
1, pointsNeeded, rank1Name
...
N, pointsNeeded, rankNName
*
engine sound file name
explosion sound file name
beep sound file name
hyperspace sound file name
shields critical warning sound file name
minLevel0, maxLevel0, maxMeteorSpeed, numMeteors, backgroundImageFile
minLevel1, maxLevel1, maxMeteorSpeed, numMeteors, backgroundImageFile
minLevel2, maxLevel2, maxMeteorSpeed, numMeteors, backgroundImageFile
...
minLevelN, maxLevelN, maxMeteorsSpeed, numMeteors, backgroundImageFile
*
craftImageFile0, craftImageFile1, ..., craftImageFileN
fire torpedo sounds file name
thrustIncreaseAmt, thrustDecreaseAmt, maxSpeed
meteor sprite sheet file name
minMeteorSize, numMeteorCols, numMeteorRows
defaultMaxMeteorSpeed
craft explosion sprite sheet file name
numExplosionCols, numExplosionRows
```

### Gamer Data Output File

The format of the output file is the same as the input file.  Your GamerProfile toString() method should match the format of the input file format.

#### Gamer Data Output File Format
```
gamer0 firstname, gamer0 lastname, gamer0 gamerid
gamer0Rank gamer0GamesPlayed gamer0TorpsFired gamer0MeteorsHit gamer0HighScore
gamer1 firstname, gamer1 lastname, gamer1 gamerid
gamer1Rank gamer1GamesPlayed gamer1TorpsFired gamer1MeteorsHit gamer1HighScore
...
gamerN firstname, gamerN lastname, gamerN gamerid
gamerNRank gamerNGamesPlayed gamerNTorpsFired gamerNMeteorsHit
```

### Grading

**If your code does not compile it receives a grade of zero.  See the documentation guide for instructions to properly document your code.  Up to 20 points will be deducted if your code is not properly documented.**

#### Level 1: 30% 
Implement the GamerProfile and GamerProfileCollection classes.  Create a driver/client program that will verify that these classes have been implemented correctly.  That means that GamerProfile should be implemented first and tested before starting on GamerProfileCollection.  Use the toString() method to verify the contents of the objects. To test GamerProfileCollection, instantiate 3 GamerProfile objects and add them to GamerProfileCollection.  You can then experiment with setting the selectedProfile and highGameProfile to different GamerProfiles in GamerProfileCollection and call the toString() method for GamerProfileCollection.  Again, the format of the toString should match the gamer profile data input file format.

#### Level 2: 50%
Implement the readGamerProfileData and writeGamerProfileData static methods of the MeteorIO class.  The writeGamerProfileData class should produce output that is consistent with the gamer profile data input file.  To test your code, call the readGamerProfileData class to read in the posted gamer profile data input file.  Next, make some changes to the properties of one or more of the created GamerProfile objects.  Call the writeGamerProfileData method to save the updated GamerProfiles to a file.  Now, you should be able to read in the updated GamerProfiles using your readGamerProfileData method.  

#### Level 3: 60%
Implement the Rank, RankData, Level, LevelData and SoundData classes.

#### Level 4: 90%
Implement the CraftData, MeteorData, ExplosionData and MeteorConfigData classes.  Test your classes by instantiating objects in your client main method and calling the respective toString methods.  Once you have tested these classes, implement the readConfigFile static method of the MeteorIO class.  This method should read in the complete configuration file and instantiate all the necessary objects needed to store the data in the file.

#### Level 5: 100%
Integrate your code with my GUI so that you can have fun playing the game.  I will give further instructions on the integration process in a separate document.

#### Extra Credit
See me for extra credit opportunities after you get Level 5 complete.

### Submission

All assignments **MUST** be submitted using GitHub. Assignments will not be accepted in any other form. Failure to commit and/or push code is not an excuse for failing to submit. The following resources will help with using GitHub for this lab:
 * [GitHub for Major Programs Video](https://www.youtube.com/watch?v=l2bP9JKQkdA)
 * [GitHub for Major Programs Reference Sheet](https://gist.github.com/ccannon94/511115be821a873ae9ec5f4db9cfdda0)
