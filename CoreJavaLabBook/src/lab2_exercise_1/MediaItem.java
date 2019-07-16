package lab2_exercise_1;

abstract public class MediaItem extends Item{
	public MediaItem(int id_no, int no_of_copies, String title) {
		super(id_no, no_of_copies, title);
		// TODO Auto-generated constructor stub
	}

	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
}
