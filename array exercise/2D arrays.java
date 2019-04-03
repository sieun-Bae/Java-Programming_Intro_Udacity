//int [] [] grades

public static double sandAverage(int [][] grades, int student){
	int subjects = grades.length;
	for (int i=0; i<subjects; i++){
		total += grades[i][student];
	}
	double average = total/(double)subjects;
	return average;
}

//grades.length ==> nrow, grades[0].length ==> ncol