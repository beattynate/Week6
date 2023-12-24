package week6WarGame;

	public class Card {
		private String value;
		private String name;
		private int rank;
		
		public Card(String value, String name, int rank) {
			this.setValue(value);
			this.setName(name);
			this.setRank (rank);
		}

		private void setRank(int rank) {
			this.rank = rank;
			
		}
		public int getRank() {
			return rank;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public void describe() {
			System.out.println(value + " of " + name);
		}
}
