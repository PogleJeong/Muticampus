package student_management_system;

public class assignment_20221223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생성적관리
		String name[] = {"홍길동","성춘향","일지매"};
		int language[] = { 90, 100, 120 };
		int math[] = { 90, 95, 80 };
		int english[] = { 100, 90, 85 };
		
		// 지정과목의 총점
		System.out.printf("국어과목 총점: %d\n", subjectScoreSum(language));
		System.out.printf("수학과목 총점: %d\n", subjectScoreSum(math));
		System.out.printf("영어과목 총점: %d\n", subjectScoreSum(english));
		
		// 지정과목의 평균
		System.out.printf("국어과목 평균: %f\n", subjectScoreAvg(language));
		System.out.printf("수학과목 평균: %f\n", subjectScoreAvg(math));
		System.out.printf("영어과목 평균: %f\n", subjectScoreAvg(english));
		
		// 각 학생의 총점과 평균출력
		printStudentScore(name, language, math, english);
		
		// 지정과목의 1등
		System.out.print("국어과목에서 ");
		bestScoreStudent(name,language);
		System.out.print("수학과목에서 ");
		bestScoreStudent(name,math);
		System.out.print("영어과목에서 ");
		bestScoreStudent(name,english);
	}
	
	// 지정과목의 총점
	static int subjectScoreSum(int[] subject) {
		int sumScore = 0;
		for (int score: subject) {
			sumScore += score;
		}
		return sumScore;
	}
	
	// 지정과목의 평균
	static double subjectScoreAvg(int[] subject) {
		double avgScore = 0;
		for (int score: subject) {
			avgScore += (double)score;
		}
		avgScore /= subject.length;
		return avgScore;
	}
	
	// 각 학생의 총점과 평균출력
	static void printStudentScore(String[] name, int[] subject1, int[] subject2, int[] subject3) {
		
		int studentSumScore = 0;
		double studentAvgScore = 0;
		
		for (int i=0; i<name.length; i++) {
			studentSumScore = subject1[i] + subject2[i] + subject3[i];
			studentAvgScore = studentSumScore / name.length;
			System.out.printf("%s 학생의 과목총점은 %d점이며, 평균은 %f 입니다.\n", name[i], studentSumScore, studentAvgScore);
		}
	}
	
	// 지정과목의 1등
	static void bestScoreStudent(String[] name, int[] subject) {
		
		int bestScore = subject[0];
		int maxIndex=0;
		
		for (int i=0; i<name.length; i++) {
			if (bestScore < subject[i]) {
				bestScore = subject[i];
				maxIndex = i;
			}
		}
		
		System.out.printf("%s 학생이 %d으로 1등입니다!!\n",name[maxIndex], bestScore);
	}
}
