import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class clock extends JFrame{
	
	private static final long serialVersionUID=1L;
	JTextField timeF;
	JPanel panel;
	
	public clock() {
		super("Java Clock");
		setSize(225,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);
		
		
		panel=new JPanel();
		panel.setLayout(new FlowLayout());
		
		
		timeF = new JTextField(10);
		timeF.setEditable(false);
		timeF.setFont(new Font("Arial",Font.PLAIN,48));
		
		panel.add(timeF);
		add(panel);
		
		Timer t=new Timer(1000,new Listener());
		t.start();
	}
	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Calendar rightNow=Calendar.getInstance();
			
			int hour =rightNow.get(Calendar.HOUR_OF_DAY);
			int min =rightNow.get(Calendar.MINUTE);
			int sec=rightNow.get(Calendar.SECOND);
			
			timeF.setText(hour+":"+min+":"+sec);
			
		}
		
	}
	
	
	
	

}
