package model;

public class Item {
	 private int id;
	    private String itemName;
	    private String itemDescription;
	    private String itemImage;
	    
//		public Item(int id, String itemName, String itemDescription, String itemImage) {
//			super();
//			this.id = id;
//			this.itemName = itemName;
//			this.itemDescription = itemDescription;
//			this.itemImage = itemImage;
//		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemDescription() {
			return itemDescription;
		}

		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}

		public String getItemImage() {
			return itemImage;
		}

		public void setItemImage(String itemImage) {
			this.itemImage = itemImage;
		}
	    
	    
}
