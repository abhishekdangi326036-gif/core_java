package co.in.rays.op;

public class OnlineExamination {

	Integer examId;
	String subject;
	Integer totalQuestion;
	Integer duration;
	Integer totalMarks;

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setTotalQuestion(Integer totalQuestion) {
		this.totalQuestion = totalQuestion;
	}

	public Integer getTotalQuestion() {
		return totalQuestion;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

}
