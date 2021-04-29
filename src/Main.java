import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmAmpdSetlistGenerator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmAmpdSetlistGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmpdSetlistGenerator = new JFrame();
		frmAmpdSetlistGenerator.setTitle("AMP'D Setlist Generator");
		frmAmpdSetlistGenerator.setBounds(100, 100, 482, 349);
		frmAmpdSetlistGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmAmpdSetlistGenerator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel song1Label = new JLabel("Song 1");
		song1Label.setBounds(10, 11, 446, 14);
		panel.add(song1Label);
		
		JLabel song2Label = new JLabel("Song 2");
		song2Label.setBounds(10, 59, 446, 14);
		panel.add(song2Label);
		
		JLabel song3Label = new JLabel("Song 3");
		song3Label.setBounds(10, 114, 446, 14);
		panel.add(song3Label);
		
		JLabel song4Label = new JLabel("Song 4");
		song4Label.setBounds(10, 158, 446, 14);
		panel.add(song4Label);
		
		JButton generateButton = new JButton("Generate");
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				BusinessLogic logic = new BusinessLogic();
				try {
					String fastDirectory = logic.SelectFastSongDirectory();
					String slowDirectory = logic.SelectSlowSongDirectory();
					
					
					song1Label.setText(logic.GenerateSong1(fastDirectory));
					song2Label.setText(logic.GenerateSong2(fastDirectory));
					
					if(song2Label.getText() == song1Label.getText())
						song2Label.setText(logic.GenerateSong2(fastDirectory));
					
					
					song3Label.setText(logic.GenerateSong3(slowDirectory));
					
					if(song4Label.getText() == song4Label.getText())
						song4Label.setText(logic.GenerateSong2(fastDirectory));
					song4Label.setText(logic.GenerateSong4(slowDirectory));
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		generateButton.setBounds(183, 224, 135, 45);
		panel.add(generateButton);
	}
}
