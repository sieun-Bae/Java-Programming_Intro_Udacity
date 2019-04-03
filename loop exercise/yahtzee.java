//Yahtzee
public int rollDice(int sides){
	double randNum = Math.random() * sides;
	randNum = randNum + 1;
	return (int) randNum;
}

public int keepRolling() {
    int dice1 = rollDice();
    int dice2 = rollDice();
    int dice3 = rollDice();
    int dice4 = rollDice();
    int dice5 = rollDice();
    int count = 1;
    while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){
        //we need to re-roll
        dice1 = rollDice();
        dice2 = rollDice();
        dice3 = rollDice();
        dice4 = rollDice();
        dice5 = rollDice();
        count = count + 1;
    }
    return count;
}

/**
*Rolls a dice till you get a 6 then you win
*but if you get a 3 you lose
*/

public boolean rollASix(){

	int dice = rollDice(6);
	while(dice != 6){
		dice = rollDice();
		if (dice == 3) 
			break;
	}
	if(dice == 6)
		return true;
	else
		return false; 
}


















