//check Alarm
public boolean checkAlarm(){}

public void beep(){}

public void alarm(){
	boolean on = checkAlarm();
	while(on){
		beep();
		on = checkAlarm();
	}
}

//using while loop
public void raiseAlarm(int numOfWarnings){
	int i=1;
	while(i<=numOfWarnings){
		System.out.println("Warning");
		i++; 
	}
}
//using for loop
public void raiseAlarm2(int numOfWarnings){
	for(int i=1; i<=numofWarnings; i++){
		System.out.println("Warning");
	}
}




//googol
String googol = "1";
int len = googol.length();
while(len < 101){
	google = googol + "0";
	len = googol.length();
}