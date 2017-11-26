package sa_task;

public class Counter implements Observer {
	public int count;
	public int tid;
	
	@Override
	public void update(String message) {
		// times of view
		if (message == "1") {
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public Counter(int tid) {
		this.tid = tid;
		count = 0;
	}
	
}
