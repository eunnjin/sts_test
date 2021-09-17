package ex02.di;

public class ScoreImpl implements Score {
	
	private int kor, eng, com;

	// constructor method
	public ScoreImpl() {
		this(0,0,0);
	}
	public ScoreImpl(int kor, int eng, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	
	// setter, getter
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getCom() {
		return com;
	}
	
	@Override
	public int total() {
		return this.kor + this.eng + this.com;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}

}
