//pyramid

public int countBlocks(int levels){
    int total = 0;
    for(int i=1; i<=levels; i++){
        total = total + i*i;
    }
    return total;
}

/**
*ADDS THE NUMBERS 15 + 16 + .. + 20
*@return the total sum
*/
public int addNumbers(){
	int sum=0;
	for(inti=15; i<=20; i++){
		sum =sum+i;
	}
	return sum;
}
