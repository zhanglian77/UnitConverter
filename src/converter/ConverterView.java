package converter;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterView extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterView frame = new ConverterView();
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
	public ConverterView() {
		
		List<String> temperatureItems = new ArrayList<String>();
		temperatureItems.add("K");
		temperatureItems.add("°„C");
		temperatureItems.add("°„F");
		
		List<String> volumeItems = new ArrayList<String>();
		volumeItems.add("l");
		volumeItems.add("ml");
		volumeItems.add("US gal");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel temMessager = new JLabel(" ");
		temMessager.setBounds(130, 97, 296, 15);
		contentPane.add(temMessager);
		temMessager.setForeground(Color.RED);
		
		JLabel volMessager = new JLabel(" ");
		volMessager.setBounds(124, 234, 302, 15);
		contentPane.add(volMessager);
		volMessager.setForeground(Color.RED);
		
		JLabel lblTemputatureConverter = new JLabel("Temperature Converter:");
		lblTemputatureConverter.setBounds(5, 5, 426, 15);
		contentPane.add(lblTemputatureConverter);
		
		JTextField temInput = new JTextField();
		temInput.setBounds(27, 48, 66, 21);
		contentPane.add(temInput);
		temInput.setColumns(10);
		
		JComboBox<String> temInputBox = new JComboBox<String>();		
		temInputBox.setBounds(124, 47, 46, 23);
		contentPane.add(temInputBox);		
		
		JLabel label = new JLabel("=");
		label.setBounds(191, 51, 23, 15);
		contentPane.add(label);
		
		JLabel temOutput = new JLabel("?");
		temOutput.setBounds(224, 51, 107, 15);
		contentPane.add(temOutput);
		
		JComboBox<String> temOutputBox = new JComboBox<String>();
		temOutputBox.setBounds(341, 47, 46, 23);
		contentPane.add(temOutputBox);
		
		for (int i = 0; i < temperatureItems.size(); i++) {
			temInputBox.addItem(temperatureItems.get(i));
			temOutputBox.addItem(temperatureItems.get(i));
		}
		
		JButton tembtn = new JButton("Start!");
		tembtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				temMessager.setText(" ");
				String inputType = (String) temInputBox.getSelectedItem();
				String outputType = (String) temOutputBox.getSelectedItem();
				
				if (inputType.equals("K") && outputType.equals("°„C")) {
					temOutput.setText(Converter.kToC(temInput.getText()));					
				}
				else if (inputType.equals("K") && outputType.equals("°„F")) {
					temOutput.setText(Converter.kToF(temInput.getText()));					
				}
				else if (inputType.equals("°„C") && outputType.equals("°„F")) {
					temOutput.setText(Converter.cToF(temInput.getText()));					
				}
				else if (inputType.equals("°„C") && outputType.equals("K")) {
					temOutput.setText(Converter.cToK(temInput.getText()));					
				}
				else if (inputType.equals("°„F") && outputType.equals("K")) {
					temOutput.setText(Converter.fToK(temInput.getText()));					
				}
				else if (inputType.equals("°„F") && outputType.equals("°„C")) {
					temOutput.setText(Converter.fToC(temInput.getText()));					
				}
				else if (inputType.equals(outputType)) {
					temMessager.setText("Please choose two different Units.");					
				}
			}
				catch (NumberFormatException e) {
					temMessager.setText("Invalid input type. Please enter number only.");
				}
			}
		});
		tembtn.setBounds(27, 93, 93, 23);
		contentPane.add(tembtn);
		
		JLabel lblVolumeConverter = new JLabel("Volume Converter:");
		lblVolumeConverter.setBounds(5, 138, 140, 15);
		contentPane.add(lblVolumeConverter);
		
		JTextField volInput = new JTextField();
		volInput.setBounds(27, 180, 66, 21);
		contentPane.add(volInput);
		volInput.setColumns(10);
		
		JComboBox<String> volInputBox = new JComboBox<String>();
		volInputBox.setBounds(115, 179, 66, 23);
		contentPane.add(volInputBox);
		
		JLabel label_2 = new JLabel("=");
		label_2.setBounds(191, 181, 23, 18);
		contentPane.add(label_2);
		
		JLabel volOutput = new JLabel("?");
		volOutput.setBounds(224, 183, 107, 15);
		contentPane.add(volOutput);
		
		JComboBox<String> volOutputBox = new JComboBox<String>();
		volOutputBox.setBounds(332, 179, 66, 23);
		contentPane.add(volOutputBox);
		
		for (int i = 0; i < volumeItems.size(); i++) {
			volInputBox.addItem(volumeItems.get(i));
			volOutputBox.addItem(volumeItems.get(i));
		}
		
		JButton volbtn = new JButton("Start!");
		volbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					volMessager.setText(" ");
					String inputType = (String) volInputBox.getSelectedItem();
					String outputType = (String) volOutputBox.getSelectedItem();
					
					if (inputType.equals("l") && outputType.equals("ml")) {
						volOutput.setText(Converter.lToMl(volInput.getText()));					
					}
					else if (inputType.equals("l") && outputType.equals("US gal")) {
						volOutput.setText(Converter.lToGal(volInput.getText()));					
					}
					else if (inputType.equals("ml") && outputType.equals("l")) {
						volOutput.setText(Converter.mlTol(volInput.getText()));					
					}
					else if (inputType.equals("ml") && outputType.equals("US gal")) {
						volOutput.setText(Converter.mlToGal(volInput.getText()));					
					}
					else if (inputType.equals("US gal") && outputType.equals("l")) {
						volOutput.setText(Converter.galToL(volInput.getText()));					
					}
					else if (inputType.equals("US gal") && outputType.equals("ml")) {
						volOutput.setText(Converter.galToMl(volInput.getText()));					
					}
					else if (inputType.equals(outputType)) {
						volMessager.setText("Please choose two different Units.");					
					}
				}
					catch (NumberFormatException e) {
						volMessager.setText("Invalid input type. Please enter number only.");
					}
			}
		});
		volbtn.setBounds(27, 230, 93, 23);
		contentPane.add(volbtn);
	}
}
