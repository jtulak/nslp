package com.redhat.oskutka.rhlp.servlet;

public class OpiceTest extends ParsingTest {

	@SuppressWarnings("serial")
	public OpiceTest() {
		// creates ParsingRestaurantGetter that retrieves the html from file and
		// also takes weekday from here instead of the current date
		parser = new Opice() {
			public String getFreshMenuHTML() throws java.io.IOException, java.text.ParseException {
				return parseHTML(preParseHTML(readFile(getClass().getResource(getHtmlFileName()).getFile())));
			};

			public int getDayOfWeek() {
				return weekday;
			}
		};
	}

}
