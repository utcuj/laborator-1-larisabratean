
public class Tren implements Comparable<Tren> {
	private String destination;
	private String date_leaving;
	private String code;
	 public Tren(String destinatie,String date_l,String code)
	 {
		 this.destination=destinatie;
		 this.date_leaving=date_l;
		 this.code=code;
	 }
	 public String getDestination() {
		 return this.destination;
	 }
	 public String getDate() {
		 return this.date_leaving;
	 }
	 public String getCode() {
		 return this.code;
	 }
	 public void setDestination(String d)
	 {
		 this.destination=d;
	 }
	 public void setDate(String d)
	 {
		 this.date_leaving=d;
	 }
	 public void setCode(String d)
	 {
		 this.destination=d;
	 }
	 public int compareTo(Tren o)
	 {
		 return getDate().compareTo(o.getDate());
	 }
}
