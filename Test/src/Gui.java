import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui
{
	private Controller controller;
	private JFrame frame;
	private JButton btnChooseFile;
	private JButton btnClickMe;

	public Gui(Controller controller)
	{
		this.controller = controller;
		initialize();
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getBtnChooseFile());
		frame.getContentPane().add(getBtnClickMe());
		frame.setVisible(true);
	}

	private JButton getBtnChooseFile()
	{
		if (btnChooseFile == null)
		{
			btnChooseFile = new JButton("choose file");
			btnChooseFile.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					controller.selectFile();
				}
			});
			btnChooseFile.setBounds(65, 97, 101, 29);
		}
		return btnChooseFile;
	}

	private JButton getBtnClickMe()
	{
		if (btnClickMe == null)
		{
			btnClickMe = new JButton("click me");
			btnClickMe.setBounds(247, 97, 101, 29);
		}
		return btnClickMe;
	}
	
	public void setButtonClickMeListener(ActionListener l)
	{
		this.btnClickMe.addActionListener(l);
	}
}
