package tp.ws.amoa.model;

public class Item {
	   private long id;
	    private String label;
	    private double price;

	    public Item() {
	        super();
	    }

	    public Item(long id, String label, double price) {
	        super();
	        this.id = id;
	        this.label = label;
	        this.price = price;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getLabel() {
	        return label;
	    }

	    public void setLabel(String label) {
	        this.label = label;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
}
