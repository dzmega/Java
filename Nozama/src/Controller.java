import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Controller
{
	private Gui gui;
	public DefaultListModel<Produkt> dlm1 = new DefaultListModel<Produkt>();
	public DefaultListModel<Produkt> dlm2 = new DefaultListModel<Produkt>();
	private Produkt produkt;
	private Warenkorb warenkorb;
	
	public Controller()
	{
		laden();
		btnLaden();
		this.gui = new Gui(this);
	}
	
	protected void laden()
	{
		try
		{
			String zeile;
			String filename = "C:/Users/David/Desktop/Schule/Java/Nozama/bin/Artikeldatei.txt";
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			try
			{
				while((zeile = reader.readLine()) != null)
				{
					String[] split = zeile.split(";");
					produkt = new Produkt(split[0],split[1],split[2]);
					dlm1.addElement(produkt);
				}
			}
			catch(IOException ex)
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				reader.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Fehler!");
		}
	}
	
	protected void add(Produkt objekt)
	{
		dlm2.addElement(objekt);
		dlm1.removeElement(objekt);
	}
	
	protected void remove(Produkt objekt)
	{
		dlm1.addElement(objekt);
		dlm2.removeElement(objekt);
	}
	
	protected void bestellen()
	{
		if(gui.textField.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Bitte Namen eingeben!", "Namen eingeben!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(dlm2.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Bitte eine Ware hinzuf�gen!", "Ware hinzuf�gen!", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			warenkorb = new Warenkorb(gui.textField.getText());
			write();
			JOptionPane.showMessageDialog(null, "Vielen Dank f�r Ihre Bestellung!", "Bestellung abgeschlossen!", JOptionPane.INFORMATION_MESSAGE);
			dlm1.removeAllElements();
			dlm2.removeAllElements();
			laden();
		}
	}
	
	protected void write()
	{	
		for(int i = 0; i < dlm2.size(); i++)
		{
			System.out.println(dlm2.getElementAt(i).getBezeichnung());
		}
		try
		{
			Path path = Path.of("C:/Users/David/Desktop/Schule/Java/Nozama/bin/" + warenkorb.toString());
			Files.createFile(path);
			for(int i = 0; i < dlm2.size(); i++)
			{
				String zeile = "Artikelnummer: " + dlm2.getElementAt(i).getNummer() + "; Gegenstand: " + dlm2.getElementAt(i).getBezeichnung() + "; Preis: " + dlm2.getElementAt(i).getPreis();
				Files.write(path, zeile.getBytes());
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void btnLaden()
	{
		this.gui.setBtnAddListener(new ButtonAddListener());
		this.gui.setBtnRemoveListener(new ButtonRemoveListener());
		this.gui.setBtnBestellenListener(new ButtonBestellenListener());
	}
	
	class ButtonBestellenListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			//bestellen();
			System.out.println("bestellen");
		}
	}
	
	class ButtonAddListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			//add((Produkt) gui.listArtikel.getSelectedValue());
			System.out.println("add");
		}
	}
	
	class ButtonRemoveListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			//controller.remove((Produkt) listWarenkorb.getSelectedValue());
			System.out.println("remove");
		}
	}
}
