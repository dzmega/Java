import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui
{

	private JFrame frame;
	private Controller controller;
	private JList list;
	private JButton btnAufsteigend;
	private JButton btnAbsteigend;
	private JTextField textField;
	private JButton btnSuchen;
	private JButton btnZurueck;
	private JComboBox comboBox;

	public Gui(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getList());
		frame.getContentPane().add(getBtnAufsteigend());
		frame.getContentPane().add(getBtnAbsteigend());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getBtnSuchen());
		frame.getContentPane().add(getBtnZurueck());
		frame.getContentPane().add(getComboBox());
		frame.setVisible(true);
	}

	protected JList getList()
	{
		if (list == null)
		{
			list = new JList();
			list.setBounds(42, 33, 252, 309);
		}
		return list;
	}

	private JButton getBtnAufsteigend()
	{
		if (btnAufsteigend == null)
		{
			btnAufsteigend = new JButton("Aufsteigend");
			btnAufsteigend.setBounds(365, 58, 100, 23);
		}
		return btnAufsteigend;
	}

	private JButton getBtnAbsteigend()
	{
		if (btnAbsteigend == null)
		{
			btnAbsteigend = new JButton("Absteigend");
			btnAbsteigend.setBounds(365, 104, 100, 23);
		}
		return btnAbsteigend;
	}

	protected void setBtnAufsteigendListener(ActionListener l)
	{
		this.btnAufsteigend.addActionListener(l);
	}

	protected void setBtnAbsteigendListener(ActionListener l)
	{
		this.btnAbsteigend.addActionListener(l);
	}

	protected void setBtnSuchenListener(ActionListener l)
	{
		this.btnSuchen.addActionListener(l);
	}

	protected void setBtnZurueckListener(ActionListener l)
	{
		this.btnZurueck.addActionListener(l);
	}

	protected JTextField getTextField()
	{
		if (textField == null)
		{
			textField = new JTextField();
			textField.setBounds(365, 160, 199, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JButton getBtnSuchen()
	{
		if (btnSuchen == null)
		{
			btnSuchen = new JButton("Suchen");
			btnSuchen.setBounds(475, 205, 89, 23);
		}
		return btnSuchen;
	}

	private JButton getBtnZurueck()
	{
		if (btnZurueck == null)
		{
			btnZurueck = new JButton("Zurück");
			btnZurueck.setBounds(475, 239, 89, 23);
		}
		return btnZurueck;
	}

	protected JComboBox getComboBox()
	{
		if (comboBox == null)
		{
			comboBox = new JComboBox();
			comboBox.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent e)
				{
					
				}
			});
			comboBox.setBounds(365, 277, 199, 22);
		}
		return comboBox;
	}
}
