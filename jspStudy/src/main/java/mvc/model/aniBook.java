package mvc.model;

public class aniBook {
	
	private String bookId;
	private String name;
	private int unitPrice;
	private String author;
	private String description;
	private String publisher;
	private String category;
	private long unitsInStock;
	private String releaseDate;
	private String condition;
	private String filename;
	private int quantity;
	
	//기본 생성자
	public aniBook() {
		super();
	}

	public aniBook(String bookId, String name, int unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	
	//게터 세터
	public String getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public String getAuthor() {
		return author;
	}

	public String getDescription() {
		return description;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getCategory() {
		return category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getCondition() {
		return condition;
	}

	public String getFilename() {
		return filename;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "aniBook [bookId=" + bookId + ", name=" + name + ", unitPrice=" + unitPrice + ", author=" + author
				+ ", description=" + description + ", publisher=" + publisher + ", category=" + category
				+ ", unitsInStock=" + unitsInStock + ", releaseDate=" + releaseDate + ", condition=" + condition
				+ ", filename=" + filename + ", quantity=" + quantity + "]";
	}
}
