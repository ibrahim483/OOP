package Quistion1;


public class TestSigna{

	public static void main(String[] args) {
		Signal s = new Signal();
		s.setSamplar(new DefaultSampler());

		
		
		s.addSignalObserver(new SignalWindow());
	
	}

}
