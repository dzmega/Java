import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Controller
{
	private Gui gui;
	private ArrayList<Film> list = new ArrayList<Film>();
	private DefaultListModel<Film> dlm1 = new DefaultListModel<Film>();
	private boolean check = false;
	private ArrayList<Genre> genres = new ArrayList<Genre>();
	private DefaultComboBoxModel<Genre> dcm1 = new DefaultComboBoxModel<Genre>();

	public Controller()
	{
		this.gui = new Gui(this);
		read();
		btnReady();
		genreReady();
		setModel();
	}
	
	private void aufsteigend()
	{
		if(check == true)
		{
			dlm1.removeAllElements();
			Collections.reverse(list);
			dlm1.addAll(list);
			check = false;
		}
	}
	
	private void absteigend()
	{
		if(check == false)
		{
			dlm1.removeAllElements();
			Collections.reverse(list);
			dlm1.addAll(list);
			check = true;
		}
	}
	
	private void suchen()
	{
		dlm1.removeAllElements();
		String teil = this.gui.getTextField().getText();
		List<Film> sorted = list.stream()
				.filter(f -> f.getName().contains(teil))
				.collect(Collectors.toList());
		dlm1.addAll(sorted);
		
		sucheGenre();
	}
	
	private void zurueck()
	{
		dlm1.removeAllElements();
		this.gui.getTextField().setText("");
		dlm1.addAll(list);
	}
	
	private void sucheGenre()
	{
		dlm1.removeAllElements();
		//String gen = this.gui.getComboBox().getSelectedItem().toString();
		/*List<Film> sorted = list.stream()
				.filter(f1 -> f1.getGenre().equals(gen))
				.collect(Collectors.toList());
		dlm1.addAll(sorted);*/
		
		
		for(Film film: list)
		{
			if(this.gui.getComboBox().getSelectedItem().toString().equals(film.getGenre().toString()))
			{
				dlm1.addElement(film);
			}
		}
		
	}
	
	private void setModel()
	{
		this.gui.getList().setModel(dlm1);
		this.gui.getComboBox().setModel(dcm1);
	}
	
	private void btnReady()
	{
		this.gui.setBtnAufsteigendListener(l -> aufsteigend());
		this.gui.setBtnAbsteigendListener(l -> absteigend());
		this.gui.setBtnSuchenListener(l -> suchen());
		this.gui.setBtnZurueckListener(l -> zurueck());
	}
	
	private void genreReady()
	{
		genres.add(new Genre(""));
		genres.add(new Genre("Drama"));
		genres.add(new Genre("Action"));
		genres.add(new Genre("Science-Fiction"));
		genres.add(new Genre("Fantasyfilm"));
		genres.add(new Genre("Komoedie"));
		genres.add(new Genre("Thriller"));
		dcm1.addAll(genres);
	}
	
	private void read()
	{
		String file = "C:\\Users\\David\\Desktop\\Schule\\Java\\Filmdatenbank\\src\\FilmListe2.txt";
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));
			String zeile;
			try
			{
				reader.readLine();
				while((zeile = reader.readLine()) != null)
				{
					String[] split = zeile.split(";");
					Film film = new Film(Integer.parseInt(split[0]), split[1], new Genre(split[2]), Integer.parseInt(split[3]));
					if(!list.contains(film))
					{
						list.add(film);
						dlm1.addElement(film);
					}
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
			System.out.println(e.getMessage());
		}
	}
}
