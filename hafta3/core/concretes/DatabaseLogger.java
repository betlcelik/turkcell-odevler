package hafta3.core.concretes;

import hafta3.core.abstracts.Logger;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged to database" + data);
		
	}

}
