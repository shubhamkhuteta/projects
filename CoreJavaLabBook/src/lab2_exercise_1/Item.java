package lab2_exercise_1;

abstract public class Item {
	private int id_no, no_of_copies;
	private String title;
	
	public int getId_no() {
		return id_no;
	}

	public void setId_no(int id_no) {
		this.id_no = id_no;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public Item( int id_no,int no_of_copies,String title) {
		// TODO Auto-generated constructor stub
		this.id_no=id_no;
		this.no_of_copies=no_of_copies;
		this.title=title;
	}
	
}


