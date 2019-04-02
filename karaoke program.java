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
