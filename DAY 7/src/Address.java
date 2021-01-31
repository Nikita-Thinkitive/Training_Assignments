import java.io.Serializable;

public class Address implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 11;
		private String city;
		
		public Address() {
			city="pune";
			
		}
		public Address(String city)
		{
			this.city=city;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "city=" + city + " ";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((city == null) ? 0 : city.hashCode());
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
			return true;
		}
		
		
}
