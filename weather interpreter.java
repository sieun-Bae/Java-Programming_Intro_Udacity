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
