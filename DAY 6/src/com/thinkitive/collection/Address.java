import java.util.Comparator;

public class Address implements Comparable<Address>
{
	
	 String city;
	double pin;
	
	public Address() {
		this.city="";
		this.pin=11;
	}
	public Address(String city,double pin) {
		this.city=city;
		this.pin=pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPin() {
		return pin;
	}

	public void setPin(double pin) {
		this.pin = pin;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (Double.doubleToLongBits(pin) != Double.doubleToLongBits(other.pin))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	@Override
	public int compareTo(Address e1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

