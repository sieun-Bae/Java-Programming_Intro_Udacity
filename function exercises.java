//karaoke program


boolean playButton; // true or false

public void playMusic(){
    if(playButton) {
        System.out.println("Music is playing");
    } else {
        System.out.println("Music is paused");
    }
}

public void chorus(){
	System.out.println("Once I had a love and it was a gas");
	System.out.println("Soon turned out had a heart of glass");
	System.out.println("Seemed like the real thing, only to find");
	System.out.println("Mucho mistrust, love's gone behind");
}

public void greeting(String location){
	System.out.println("Hello, " + location);
}

chorus();
greeting("New York");


//Weather Interpreter
int degreesC = 32;

public void weatherInterpreter(int temperature) {
	if (temperature > 30) {
		System.out.println("It's hot outside!");
	} else if (temperature < 5){
		System.out.println("Brr, consider wearing a jacket.");
	} else {
		System.out.println("Not too hot, not too cold.");
	}
}

weatherInterpreter(4);
weatherInterpreter(degreesC);


//rollercoaster

public void admission(double height){
	if(height>120){
		System.out.println("You pass the height requirements.");
	} else {
		System.out.println("Sorry, you do not pass.");
	}
}

admission(130.5);


//printPhoto

public void printPhoto(int width, int height, boolean inColor){
	System.out.println("Width = "+width+"cm");
	System.out.println("Height = "+height+"cm");
	if(inColor){
		System.out.println("Print is full color.");
	} else {
		System.out.println("Print is black and white.");
	}

}

printPhoto(10,20,false);

//likePhoto

public void likePhoto(int currentLikes, String comment, boolean like){
	System.out.println("Feedback "+ comment);
	if(like){
		currentLikes = currentLikes+1;
	}
	System.out.println("Number of likes: "+currentLikes);
}

likePhoto(10, "great photo!", true);

///return value

public int likePhoto(int currentLikes, String comment, boolean like){
System.out.println("Feedback "+ comment);
	if(like){
		currentLikes = currentLikes+1;
	}
	System.out.println("Number of likes: "+currentLikes);	

	return currentLikes;
}

int returnedLikes = likePhoto(returnedLikes, "nice color!", true);
int totalLikes = likePhoto(returnedLikes, "I like this", true);


//making change

public double makeChange(double itemCost, double dollarsProvided){
	double change = dollarsProvided - itemCost;
	return change;
}

//random numbers

double randomNumber = Math.random();
randomNumber = randomNumber * 10;

int randomInt = (int) randomNumber;

//rolling Dice
/**
*This dice function simulates a random dice roll
*for a dice with a given number of sides.
*
*@param sides the number of sides of a dice
*@return random roll value (an int)
*/
public int rollDice(int sides) {
	double randomNumber = Math.random();
	randomNumber = randomNumber * sides;
	randomNumber = randomNumber + 1; //1-(almost)7
	int randomInt = (int) randomNumber; //1-6
	return randomInt; 
}



public double absoluteValue(double n){
	if (n < 0) {
		return -n;
	}	else {
		return n;
	}
}

public double calculateTip(double cost){
	return cost*0.15;
}

public String nametagText(String name){
	String nametagText = "Hello, my name is"+name;
	return nametagText;
}

/**
*This printTemperature function prints the temperature in F,C
*@param arg the value of temperature in F
*@return Cel changed value F --> C
*/

public double fahrenheitToCelsius(double arg){
	double Cel = (arg-32)*5/9;
	return Cel;
}

public void printTemperature(double arg){
	System.out.println("F: "+ arg);
	System.out.println("C: "+ fahrenheitToCelsius(arg));
}


//Monopoly

public int rollDice(){
	double randomNumber = Math.random();
	randomNumber = randomNumber * 6 + 1;
	int randomInt = (int)randomNumber;
	return randomInt;
}

public void cal(int num1, int num2){
	int randNum1 = rollDice();
	int randNum2 = rollDice();
	if(randNum1 != randNum2){
		sum1 = randNum1+randNum2;
		System.out.println(sum1);	
	} else {
		System.out.println(sum1+rollDice()+rollDice());
	}
}
/**
*Returns a random integer simulating a dice roll.
*@param sides Number of sides on the virtual die being rolled.
*@return random number in the range of 1 to sides.
*/

public int diceRoll(int sides){
	double randomNumber = Math.random() * sides;
	randomNumber = randomNumber+1;
	return (int) randomNumber;
}
public int monopolyRoll(){
	int roll1 = diceRoll(6);
	int roll2 = diceRoll(6);
	int total = roll1+roll2;
	if (roll1 == roll2){
		int roll3 = diceRoll(6);
		int roll4 = diceRoll(6);
		total = total+roll3+roll4;
	}
	return total;
}
