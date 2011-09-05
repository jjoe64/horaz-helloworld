package com.example.horaz.helloworld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Event;
import com.jjoe64.gwtmobile_test.client.horaz.widgets.Button;
import com.jjoe64.gwtmobile_test.client.horaz.widgets.Toast;
import com.jjoe64.gwtmobile_test.client.horaz.widgets.Toast.Duration;
import com.jjoe64.gwtmobile_test.client.horaz.widgets.events.TapListener;

public class HorazHelloworld implements EntryPoint {
	@Override
	public void onModuleLoad() {
		// get button
		Button btn = Button.byId("button");

		// set a tap (click) listener
		btn.addTapListener(new TapListener() {
			@Override
			public void onTap(Event event) {
				// show the toast notification
				new Toast("I love Horaz!", Duration.SHORT).show();
			}
		});
	}
}
