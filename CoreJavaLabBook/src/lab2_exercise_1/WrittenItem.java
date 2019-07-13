package lab2_exercise_1;

abstract class WrittenItem extends Item{

	private String author;
	
	public WrittenItem(int id_no, int no_of_copies, String title) {
		super(id_no, no_of_copies, title);
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
	
}
