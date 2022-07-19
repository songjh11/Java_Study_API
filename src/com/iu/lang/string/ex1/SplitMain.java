package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		WorkerDTO [] workerDTO = ws.init();
				
		wv.view(workerDTO);
	
		
		int num = 100;
		String str = String.valueOf(num);
		
		System.out.println(str);

	}

}
