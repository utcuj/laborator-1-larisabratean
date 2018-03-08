import java.util.*;

public class Gara {
protected List <Tren> gara_tren=new ArrayList<Tren>();
public Gara()
{
	gara_tren= new ArrayList<Tren>();
}
public List<Tren> getGara()
{
	List<Tren> gr=new ArrayList<Tren>();
	for (int i=0;i<gara_tren.size();i++)
	{
		gr.add(gara_tren.get(i));
	}
	return gr;
}
public void setGara(List<Tren> water)
{
	this.gara_tren=water;
}

public void addTren(Tren tr)
{
	gara_tren.add(tr);
}
public int size()
{
	return gara_tren.size();
}
public int compareTo(Tren a)
{
	return gara_tren.get(1).getDate().compareTo(a.getDate());
}
public Tren getTren(int i)
{
	return gara_tren.get(i);
}
}