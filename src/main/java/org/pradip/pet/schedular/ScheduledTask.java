package org.pradip.pet.schedular;

import org.pradip.pet.email.ScheduledEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledTask {

	@Autowired
	private ScheduledEmail scheduledEmail;

	@Scheduled(cron = "0 0 16 * * *")
	public void sendEmail() {
		System.out.println("Start Scheduling...");
		scheduledEmail.sendEmail();
	}
}
