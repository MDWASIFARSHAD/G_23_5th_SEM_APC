package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

	@Id
	private int aId;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aId, String answer) {
		super();
		this.aId = aId;
		this.answer = answer;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	private String answer;

}
