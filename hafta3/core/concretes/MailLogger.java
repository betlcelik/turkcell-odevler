package hafta3.core.concretes;

import hafta3.core.abstracts.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged to mail" + data);
		
	}

}
