package country;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Capital {

	@Column(name ="countries_KEY")
	private String cname;
	
	@Column(name="capital")
	private String capital;

	
	
	public Capital() {
		super();
	}

	public Capital(String cname, String capital) {
		super();
		this.cname = cname;
		this.capital = capital;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
}
