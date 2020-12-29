import java.nio.charset.Charset;

import de.l3s.boilerpipe.sax.HTMLDocument;
import de.l3s.boilerpipe.sax.HTMLHighlighter;

public class theMain {
	
	public static String getParsedText() {
		String text = "Its testing";
		text = "You raw HTML data ...";	
		HTMLDocument htmlDoc = new HTMLDocument(text.getBytes(), Charset.forName("utf-8"));
		final HTMLHighlighter hh = HTMLHighlighter.newExtractingInstance();
		hh.setBoldText_threshhold(50);
		hh.setStoryLength_threshhold(500);
		hh.setMultipleStories(true);
		try {
			return hh.getCustomArticle(htmlDoc);
		} catch (Exception e) {
			return e.toString();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(getParsedText() );
		
		System.out.println("Finished");
	}

}

