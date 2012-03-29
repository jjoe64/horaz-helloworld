package com.example.horaz.helloworld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Event;
import com.horaz.client.widgets.Button;
import com.horaz.client.widgets.Toast;
import com.horaz.client.widgets.Toast.Duration;
import com.horaz.client.widgets.charting.Plot;
import com.horaz.client.widgets.charting.Point;
import com.horaz.client.widgets.charting.Series;
import com.horaz.client.widgets.events.TapListener;

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

		// creates graph
		Plot plot = Plot.byId("graph");
		plot.setDimensions(300, 100);
		plot.addSeries(new Series("Power", new Point(1, 2), new Point(2, 3)));
		plot.render();
	}
}
