import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui
{
	private Controller controller;
	private JFrame frame;
	private JButton btnAdd;
	private JButton btnRemove;
	private JLabel lblNewLabel_1;
	public JTextField textField;
	private JButton btnBestellen;
	public JList listArtikel;
	public JList listWarenkorb;
	private JButton btnChoose;

	public Gui(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnRemove());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getBtnBestellen());
		frame.getContentPane().add(getListArtikel());
		frame.getContentPane().add(getListWarenkorb());
		frame.getContentPane().add(getBtnChoose());
		frame.setVisible(true);
	}

	private JButton getBtnAdd()
	{
		if (btnAdd == null)
		{
			btnAdd = new JButton(">");
			btnAdd.setBounds(300, 117, 97, 23);
		}
		return btnAdd;
	}

	private JButton getBtnRemove()
	{
		if (btnRemove == null)
		{
			btnRemove = new JButton("<");
			btnRemove.setBounds(300, 164, 97, 23);
		}
		return btnRemove;
	}

	private JLabel getLblNewLabel_1()
	{
		if (lblNewLabel_1 == null)
		{
			lblNewLabel_1 = new JLabel("Kundenname");
			lblNewLabel_1.setBounds(25, 284, 83, 14);
		}
		return lblNewLabel_1;
	}

	private JTextField getTextField()
	{
		if (textField == null)
		{
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(118, 281, 150, 20);
		}
		return textField;
	}

	private JButton getBtnBestellen()
	{
		if (btnBestellen == null)
		{
			btnBestellen = new JButton("Bestellung abschicken");
			btnBestellen.setBounds(415, 280, 243, 23);
		}
		return btnBestellen;
	}

	private JList getListArtikel()
	{
		if (listArtikel == null)
		{
			listArtikel = new JList(controller.dlm1);
			listArtikel.setBounds(46, 42, 229, 200);
		}
		return listArtikel;
	}

	private JList getListWarenkorb()
	{
		if (listWarenkorb == null)
		{
			listWarenkorb = new JList(controller.dlm2);
			listWarenkorb.setBounds(429, 42, 229, 200);
		}
		return listWarenkorb;
	}

	private JButton getBtnChoose()
	{
		if (btnChoose == null)
		{
			btnChoose = new JButton("Datei wählen");
			btnChoose.setBounds(46, 11, 222, 23);
		}
		return btnChoose;
	}

	public void setButtonRemoveListener(ActionListener l)
	{
		this.btnRemove.addActionListener(l);
	}

	public void setButtonAddListener(ActionListener l)
	{
		this.btnAdd.addActionListener(l);
	}

	public void setButtonChooseListener(ActionListener l)
	{
		this.btnChoose.addActionListener(l);
	}
	
	public void setButtonBestellenListener(ActionListener l)
	{
		this.btnBestellen.addActionListener(l);
	}
}
