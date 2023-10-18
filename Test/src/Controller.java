import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Controller
{
	private Gui gui;

	public Controller()
	{
		this.gui = new Gui(this);
		laden();
	}

	protected void laden()
	{
		this.gui.setButtonClickMeListener(new ButtonClickMeListener());
	}

	class ButtonClickMeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Hello Monkey Lover :)", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	protected void selectFile()
	{
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		String test = chooser.getSelectedFile().toString();
		System.out.println(test);
		if (test != null)
		{
			reader(test);
		}
	}

	protected void reader(String path)
	{
		try
		{
			String zeile = null;
			BufferedReader reader = Files.newBufferedReader(Paths.get(path));
			try
			{
				while ((zeile = reader.readLine()) != null)
				{
					System.out.println(zeile);
				}
			} catch (IOException ex)
			{
				System.out.println(ex.getMessage());
			}
		} catch (IOException e)
		{
			System.out.println("Fehler!");
		}
	}
}
