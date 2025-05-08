
package Quistion1;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.LinkedList;

public class Signal   {
	private final int SAMPLING = 1000;
	private JTextArea jta;
	private Sampler sampler;
	
	private List<SignalObserver> observers = new LinkedList<SignalObserver>();
	
	public void addSignalObserver(SignalObserver so) {
		observers.add(so);
	}
	
	public Signal() {
		Timer t = new Timer(SAMPLING, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amplitude = sampler.read();

				// jta.append(""+String.format("%.6f", amplitude)+"\n");
				// for(int i=0;i<(int)amplitude;i++)
				// 	System.out.print('*');
				// System.out.println();
				// // inform another view 

				 
				for(SignalObserver o : observers)
					o.updateSignal(amplitude);
			}
		});
		t.start();
	}

	public void setSamplar(Sampler s) {
		this.sampler = s;
	}

}

