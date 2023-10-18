import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui
{
	private JFrame frame;
	public Controller controller;
	public JTextField textField;
	public JButton btnAdd;
	public JButton btnRemove;
	public JButton btnBestellen;

	public Gui(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList listArtikel = new JList(controller.dlm1);
		listArtikel.setBounds(10, 74, 243, 189);
		frame.getContentPane().add(listArtikel);

		JList listWarenkorb = new JList(controller.dlm2);
		listWarenkorb.setBounds(370, 74, 243, 189);
		frame.getContentPane().add(listWarenkorb);

		JButton btnAdd = new JButton(">");
		btnAdd.setBounds(263, 131, 97, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnRemove = new JButton("<");
		btnRemove.setBounds(263, 177, 97, 23);
		frame.getContentPane().add(btnRemove);

		JLabel lblNewLabel = new JLabel("Warenkorb");
		lblNewLabel.setBounds(370, 49, 90, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnBestellen = new JButton("Bestellung abschicken");
		btnBestellen.setBounds(370, 299, 243, 23);
		frame.getContentPane().add(btnBestellen);

		JLabel lblNewLabel_1 = new JLabel("Kundenname");
		lblNewLabel_1.setBounds(10, 303, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(103, 300, 150, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);
	}
	
	public void setBtnAddListener(ActionListener l)
	{
		this.btnAdd.addActionListener(l);
	}
	
	public void setBtnRemoveListener(ActionListener l)
	{
		this.btnRemove.addActionListener(l);
	}
	
	public void setBtnBestellenListener(ActionListener l)
	{
		this.btnBestellen.addActionListener(l);
	}
}
