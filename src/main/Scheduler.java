package main;

// 스케줄러 인터페이스 만들기
public interface Scheduler {

	// 대기열에서 전화를 꺼내는 메소드
	public void getNextCall();
	
	// 상담원에게 전화를 전달하는 메소드
	public void sendCallToAgent();
}
