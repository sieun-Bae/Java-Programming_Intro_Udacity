//temperature.length;

/**
*Searches an array of speed
*for the fastest (smallest) value.
*@param speed array of speeds
*@return double the fastest speed found
*/

pubic double search(double[] speed){
	int size = speed.length;
	double min = speed[0];
	for(int i=1; i<size; i++){
		if(speed[i]<min){
			min=speed[i];
		}
	}
	return min;
}

/**
*Searches an array of name
*for the longest name.
*@param names array of names
*@return longestName
*/

public String findLongestName(String [] names){
    int size = names.length;
    String longestName = names[0];
    for(int i=1; i<size; i++){
        if (names[i].length() > longestName.length()){
            longestName = names[i];
        }
    }    
    return longestName;
}
//if if condition is >=, then it will update. if not, just >, than the first longest.



//println vs print
//length() vs length

