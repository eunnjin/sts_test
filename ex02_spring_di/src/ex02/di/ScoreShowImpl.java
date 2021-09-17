package ex02.di;

import java.util.Scanner;

public class ScoreShowImpl implements ScoreShow {
	
	private ScoreImpl score;

	// setter method <-- DI
	public void setScore(ScoreImpl score) {
		this.score = score;
	}

	// constructor method <-- DI
	public ScoreShowImpl(ScoreImpl score) {
		super();
		this.score = score;
	}
	public ScoreShowImpl() {
	}

	@Override
	public void print() {
		System.out.println("kor: " + score.getKor());
		System.out.println("eng: " + score.getEng());
		System.out.println("com: " + score.getCom());
		System.out.println("total: " + score.total());
		System.out.println("avg: " + score.avg());
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		score.setKor(sc.nextInt());
		
		System.out.print("영어점수 : ");
		score.setEng(sc.nextInt());
		
		System.out.print("전산점수 : ");
		score.setCom(sc.nextInt());
	}

}
