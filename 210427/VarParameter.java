
public class VarParameter {
	public static void main(String[] args) {
		
		ShowScores score = new ShowScores();
		
		double [] scores = {90.9,100,98.9};
		
		System.out.println(score.showScore("david",scores));
		
	}
}

class ShowScores {
	
	
	public String showScore(String name,double[]scores) { //此处不能输入double… 传入多个参数
		
		
		double totalScore = 0;
		
		for(int i = 0;i< scores.length;i++) {
			totalScore += scores[i];
		}
		
		return name +" "+ totalScore;
	}
	
	
}