package di.ui;

import di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole() {
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f",exam.total(),exam.avg());
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
