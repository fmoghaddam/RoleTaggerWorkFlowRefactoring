package util;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import model.Document;

public class WikipediaFilesUtilTest {

	private static final String TEST_FILE_LOCATION ="../RoleTaggerWorkFlow-ESWC Submission/wikipediafiles/AA/wiki_00";
	
	@Test
	public void test() {
		final List<Document> documents = WikipediaFilesUtil.getDocuments(TEST_FILE_LOCATION);
		assertEquals(32, documents.size());
		for(Document d:documents) {
			assertNotNull(d.getFileLocation());
			assertNotNull(d.getSentences());
			assertNotNull(d.getTitle());
			assertNotNull(d.getContent());
			assertFalse(d.getContent().isEmpty());
			assertFalse(d.getSentences().isEmpty());
			assertEquals(TEST_FILE_LOCATION, d.getFileLocation());
		}
	}

}
