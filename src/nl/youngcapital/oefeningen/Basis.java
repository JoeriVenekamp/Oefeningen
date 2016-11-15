package nl.youngcapital.oefeningen;

public class Basis {
	
	
	private int answer;
	private int count = 0;
	
	
	
	public void setAnswer() {
		this.answer = (int)(Math.random()*100);
	}

	public int getAnswer() {
		return answer;
	}
	
	public int getCount() {
		return count;
	}
	
	boolean isCorrect (int guess){
		this.count++;
		return guess == this.answer;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
}
