import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class javaAwt{

	public Frame window;

	public javaAwt() {
		window = new Frame();
		window.setLayout(null);
		window.setSize(720, 480);
		window.setBackground(new Color(34, 34, 34));
		
		Button btn = new Button("Say Hi!");		
		btn.setBounds(60, 75, 75, 30);
		btn.setBackground(new Color(90, 90, 90));
		btn.setForeground(new Color(255, 255, 255));
		btn.setFont(new Font("Sans-Serif", Font.PLAIN, 10));
		
		window.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Label lbl = new Label("Hi!!");
				lbl.setBounds(btn.getX(), btn.getY() + 25, 80, 30);
				lbl.setForeground(Color.white);
				window.add(lbl);
			}
		});		
		
		Button closebtn = new Button("Close");		
		closebtn.setBounds(window.getWidth() - 60, 50, 40, 40);
		closebtn.setBackground(Color.RED);
		closebtn.setForeground(Color.BLACK);
		closebtn.setFont(new Font("Sans-Serif", Font.PLAIN, 10));
		
		closebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				System.exit(0);
			}
		});
		
      window.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
          }        
       });   
		
		window.add(closebtn);
				
		window.setTitle("My First Java AWT App!");
		window.setIconImage(Toolkit.getDefaultToolkit().getImage("m.png"));
		window.setVisible(true);
		
		window.setAlwaysOnTop(false);
	}
	
	public static void main(String[] args) {
		javaAwt j = new javaAwt();
		System.out.println(j.window.getState());
	}

}
