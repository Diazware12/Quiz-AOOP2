import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 81, 122, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBounds(142, 192, 122, 48);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		comboBox = new JComboBox();
		comboBox.addItem("testing");
		comboBox.setBounds(142, 24, 122, 49);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 137, 122, 49);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setBounds(12, 40, 94, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("price");
		lblNewLabel_1.setBounds(12, 97, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("qty");
		lblNewLabel_2.setBounds(12, 153, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblStock = new JLabel("stock: ");
		lblStock.setBounds(12, 208, 56, 16);
		contentPane.add(lblStock);
		
		table_1 = new JTable();
		table_1.setBounds(276, 24, 444, 216);
		contentPane.add(table_1);
		

	}
}
