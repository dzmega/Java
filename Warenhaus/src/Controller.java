import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Controller
{
	public DefaultListModel<Produkt> dlm1 = new DefaultListModel<Produkt>();
	public DefaultListModel<Produkt> dlm2 = new DefaultListModel<Produkt>();
	private Gui gui;
	private Produkt produkt;
	private String path;
	private int count = 0;

	public Controller()
	{
		this.gui = new Gui(this);
		btnladen();
	}

	protected void btnladen()
	{
		this.gui.setButtonChooseListener(new ButtonChooseListener());
		this.gui.setButtonAddListener(new ButtonAddListener());
		this.gui.setButtonRemoveListener(new ButtonRemoveListener());
		this.gui.setButtonBestellenListener(new ButtonBestellenListener());
	}

	class ButtonChooseListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser chooser = new JFileChooser();
			chooser.showOpenDialog(null);
			path = chooser.getSelectedFile().toString();
			System.out.println(path);
			reader();
		}
	}

	class ButtonAddListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			produkt = (Produkt) gui.listArtikel.getSelectedValue();
			dlm2.addElement(produkt);
			dlm1.removeElement(produkt);
		}
	}

	class ButtonRemoveListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			produkt = (Produkt) gui.listArtikel.getSelectedValue();
			dlm2.removeElement(produkt);
			dlm1.addElement(produkt);
		}
	}

	class ButtonBestellenListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (gui.textField.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Bitte Namen eingeben!", "Message",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (dlm2.isEmpty() == true)
			{
				JOptionPane.showMessageDialog(null, "Bitte eine Ware hinzufügen!", "Message",
						JOptionPane.INFORMATION_MESSAGE);
			} else
			{
				bestellen();
			}
		}
	}

	protected void reader()
	{
		try
		{
			String zeile;
			BufferedReader reader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8));
			try
			{
				reader.readLine();
				while ((zeile = reader.readLine()) != null)
				{
					String[] split = zeile.split(";");
					split[2] = split[2].replace("€", " ");
					split[2] = split[2].replace(",", ".");
					produkt = new Produkt(Integer.parseInt(split[0]), split[1], Double.parseDouble(split[2]));
					dlm1.addElement(produkt);
				}
			} catch (IOException ex)
			{
				ex.getMessage();
			}
			finally
			{
				reader.close();
			}
		} catch (IOException e)
		{
			System.out.println("Fehler!");
		}
	}

	protected void writer()
	{
		String filename = "C:/Users/David/Desktop/Schule/Java/Warenhaus/bin/" + gui.textField.getText() + count + ".txt";
		try
		{
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename),StandardCharsets.UTF_8);
			try
			{
				for(int i = 0; i < dlm2.getSize(); i++)
				{
					String zeile = dlm2.getElementAt(i).getArtikelnummer() + " " + dlm2.getElementAt(i).getBezeichnung() + " " + dlm2.getElementAt(i).getPreis() + "€\n";
					writer.write(zeile);
					System.out.println(zeile);
				}
			}
			catch(IOException ex)
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				writer.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Fehler!");
		}
	}

	protected void bestellen()
	{
		count++;
		writer();
		JOptionPane.showMessageDialog(null, "Vielen Dank für Ihre Bestellung!", "Message",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}
