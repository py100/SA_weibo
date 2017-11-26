package sa_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sa_task.Twitter;

public class Main {
	public static void show(List<Twitter> ts) {
		for (Twitter t : ts) {
			Counter C = (Counter)t.obs.get(0);
			System.out.println(String.format("---------\nid:%d\ncontent:%s\nviewed:%d\n---------\n", t.tid, t.content, C.count));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int cmd;
		
		List<Twitter> twitters = new ArrayList<Twitter>();
		
		while(true) {
			show(twitters);
			System.out.print("option:");
			cmd = cin.nextInt();
			// view
			if (cmd == 1) {
				for (int i = 0; i < twitters.size(); i++) {
					System.out.println(String.format("%d:%d", i, twitters.get(i).tid));
				}
				int tmp = cin.nextInt();
				twitters.get(tmp).notify("1");
			}
			// new
			else if (cmd == 2) {
				String msg = cin.next();
				Twitter t = new Twitter(msg);
				Counter tc = new Counter(t.tid);
				Log tl = new Log(t.tid);
				t.attach(tc);
				t.attach(tl);
				twitters.add(t);
				twitters.get(twitters.size()-1).notify("2");
			}
			// modify
			else if (cmd == 3) {
				for (int i = 0; i < twitters.size(); i++) {
					System.out.println(String.format("%d:%d", i, twitters.get(i).tid));
				}
				int tmp = cin.nextInt();
				twitters.get(tmp).content = cin.next();
				twitters.get(tmp).notify("3");
			}
			// del
			else if (cmd == 4) {
				for (int i = 0; i < twitters.size(); i++) {
					System.out.println(String.format("%d:%d", i, twitters.get(i).tid));
				}
				int tmp = cin.nextInt();
				twitters.get(tmp).notify("4");
				twitters.remove(tmp);
			}
			// exit
			else if (cmd == 5) {
				break;
			}
		}
		
	}

}
