import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LinkedListGUI 
{
	private JFrame frame;
	private JTextField addField;
	private JTextField removeField;
	private JTextField searchField;
	private JTextField checkField;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinkedListGUI window = new LinkedListGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LinkedListGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 609, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblJavaLinkedlistGui = new JLabel("Java Linked-List GUI");
		lblJavaLinkedlistGui.setBounds(178, 13, 142, 16);
		frame.getContentPane().add(lblJavaLinkedlistGui);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(53, 67, 116, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Remove");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(53, 120, 116, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Search");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(53, 178, 116, 25);
		frame.getContentPane().add(button_1);
		
		addField = new JTextField();
		addField.setBounds(204, 68, 116, 22);
		frame.getContentPane().add(addField);
		addField.setColumns(10);
		
		removeField = new JTextField();
		removeField.setBounds(204, 121, 116, 22);
		frame.getContentPane().add(removeField);
		removeField.setColumns(10);
		
		searchField = new JTextField();
		searchField.setColumns(10);
		searchField.setBounds(204, 179, 116, 22);
		frame.getContentPane().add(searchField);
		
		checkField = new JTextField();
		checkField.setColumns(10);
		checkField.setBounds(204, 238, 116, 22);
		frame.getContentPane().add(checkField);
		
		button_2 = new JButton("Check");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(53, 237, 116, 25);
		frame.getContentPane().add(button_2);
	}
}