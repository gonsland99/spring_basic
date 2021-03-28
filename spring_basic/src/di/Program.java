package di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.entity.Exam;
import di.entity.gonExam;
import di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		/*
		Exam exam = new gonExam();
		//ExamConsole con = new InlineExamConsole(exam);
		ExamConsole con = new GridExamConsole();
		con.setExam(exam);
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("di/setting.xml");
		
		ExamConsole con = (ExamConsole) context.getBean("con");
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		//ExamConsole con = context.getBean(ExamConsole.class);
		con.print();
		//System.out.println();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new gonExam(1,2,3,4));
//		for(Exam e : exams)
//			System.out.println(e);
	}
}
