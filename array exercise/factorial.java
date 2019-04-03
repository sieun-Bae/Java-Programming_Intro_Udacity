public int factorial(int n){
	int fac = 1;
	for(int i=1; i<=n; i++){
		fac = fac*i;
	}
	return factorial;
}

//Question 3
public int indexOfFirstOccurrence(String[] stringArray, String target){
	for(int i=1; i<stringArray.length; i++){
		if(stringArray[i].equals(target)){
			return i;
		}
	}
	return -1;
}

//Question 4
public int yearsTilOneMillion(double initialBalance){
	int howManyYears = 0;
	int savings = initialBalance;
	while (initialBalance < 1000000){
		howManyYears++;
		savings = savings * 1.05;
	}
	return howManyYears;
}

//Question 5
public void printInReverse(String[] stringArray){
	for (int i=stringArray.length;i>0;i--){
		System.out.println(stringArray[i-1]);
	}
}

//Question 6
public int findRange(int[] intArray){
	if(intArray.length == 0){
		return -1;
	}
	int max=intArray[0];
	int min=intArray[0];
	for (int i=1; i<intArray.length;i++){
		if(max < intArray[i]){
			max = intArray[i];
		}
		if(min > intArray[i]){
			min = intArray[i];
		}
	}
	return max-min;
}






















