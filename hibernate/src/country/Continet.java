package country;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
@Entity
@Table(name="Continet")
public class Continet {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="cname")
	private String cname;
	@ElementCollection
	@CollectionTable(name="Capital")
	//@MapKeyColumn(name="countries_KEY")
	//@Column(name="capital")
	private Map<Continet,Capital>countries=new HashMap<Continet,Capital>();
	
	
	
	public Continet() {
		super();
	}
	public Continet(String cname) {
		super();
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<Continet, Capital> getCountries() {
		return countries;
	}
	public void setCountries(Map<Continet, Capital> countries) {
		this.countries = countries;
	}
	
	

}
