//int [] numbers = {12, 1, 777, 3, 4, 0, 0, 121, 1, -4, 0, -100, 2}; 

String [] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Aljazeera"};

double lucky = Math.random();
lucky *= 10;

int luckyIndex = (int) lucky;

System.out.print(newsOutlet[luckyIndex]);