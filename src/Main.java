import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
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
		frmAmpdSetlistGenerator.setBounds(100, 100, 341, 349);
		frmAmpdSetlistGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmAmpdSetlistGenerator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Song 1");
		lblNewLabel.setBounds(58, 11, 257, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Song 2");
		lblNewLabel_1.setBounds(58, 58, 257, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Song 3");
		lblNewLabel_2.setBounds(58, 107, 257, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Song 4");
		lblNewLabel_3.setBounds(58, 160, 257, 14);
		panel.add(lblNewLabel_3);
		
		JButton generateButton_1 = new JButton("Generate");
		generateButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		generateButton_1.setBounds(79, 223, 135, 45);
		panel.add(generateButton_1);
	}
}
