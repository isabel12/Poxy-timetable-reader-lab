package org.developerworks.android;
public abstract class FeedParserFactory {
	static String feedUrl = "http://www.stuff.co.nz/rss/national";

	public static FeedParser getParser(){
		return getParser(ParserType.XML_PULL);
	}

	public static FeedParser getParser(ParserType type){
		switch (type){
			case SAX:
				return new SaxFeedParser(feedUrl);
			case DOM:
				return new DomFeedParser(feedUrl);
			case ANDROID_SAX:
				return new AndroidSaxFeedParser(feedUrl);
			case XML_PULL:
				return new XmlPullFeedParser(feedUrl);
			default: return null;
		}
	}
}
