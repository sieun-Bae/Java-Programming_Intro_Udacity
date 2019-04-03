public int rollDice(int sides){
	double randomNumber = Math.random() * sides;
	randomNumber = randomNumber + 1;
	return (int)randomNumber;
}
