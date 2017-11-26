package sa_task;

import java.util.Date;

public class Log implements Observer {
	public int tid;
	
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		if (message == "2") {
			// new
			System.out.println(String.format("new twitter [%d] at [%s]", tid, new Date().toString()));
		}
		// modify
		else if (message == "3") {
			System.out.println(String.format("modify twitter [%d] at [%s]", tid, new Date().toString()));
		}
		// del
		else if (message == "4") {
			System.out.println(String.format("delete twitter [%d] at [%s]", tid, new Date().toString()));
		}
		// nop
		else {
		}
	}
	
	public Log(int tid) {
		this.tid = tid;
	}
}
