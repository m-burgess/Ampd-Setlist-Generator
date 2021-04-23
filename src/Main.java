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
	private JTextField fileTextField;

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
		frmAmpdSetlistGenerator.setBounds(100, 100, 532, 345);
		frmAmpdSetlistGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmAmpdSetlistGenerator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fileTextField = new JTextField();
		fileTextField.setBounds(152, 11, 248, 20);
		panel.add(fileTextField);
		fileTextField.setColumns(10);
		
		JButton selectFileButton = new JButton("Select File");
		selectFileButton.setBounds(10, 10, 112, 23);
		panel.add(selectFileButton);
		
		JLabel lblNewLabel = new JLabel("Song 1");
		lblNewLabel.setBounds(33, 58, 89, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Song 2");
		lblNewLabel_1.setBounds(33, 105, 89, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Song 3");
		lblNewLabel_2.setBounds(33, 154, 89, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Song 4");
		lblNewLabel_3.setBounds(33, 207, 89, 14);
		panel.add(lblNewLabel_3);
		
		JLabel song1Label = new JLabel("New label");
		song1Label.setBounds(228, 58, 278, 14);
		panel.add(song1Label);
		
		JLabel song2Label = new JLabel("New label");
		song2Label.setBounds(228, 105, 278, 14);
		panel.add(song2Label);
		
		JLabel song3Label = new JLabel("New label");
		song3Label.setBounds(228, 154, 278, 14);
		panel.add(song3Label);
		
		JLabel song4Label = new JLabel("New label");
		song4Label.setBounds(228, 207, 274, 14);
		panel.add(song4Label);
		
		JButton generateButton = new JButton("Generate");
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusinessLogic bL = new BusinessLogic();
				
				song1Label.setText(bL.GenerateSong1());
				song2Label.setText(bL.GenerateSong2());
				song3Label.setText(bL.GenerateSong3());
				song4Label.setText(bL.GenerateSong4());
				
				
			}
		});
		generateButton.setBounds(152, 253, 135, 23);
		panel.add(generateButton);
	}
	
}
