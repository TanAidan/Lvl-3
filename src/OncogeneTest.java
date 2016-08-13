//Copyright Wintriss Technical Schools 2014

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class OncogeneTest
{
	@Test
	public void testOncogeneDetector()
	{
		OncogeneDetector oncogeneDetector = new OncogeneDetector();

		ArrayList<String> healthySequences = new ArrayList<String>();
		for (String sequence : new String[] {"TGCATCC", "AAATTTGGGCCC", "ATGCGCTA", "GGGTACGGAG", "TTAATTGGG"})
			healthySequences.add(sequence);

		ArrayList<String> cancerSequences = new ArrayList<String>();
		for (String sequence : new String[] {"ATTTGCAGG", "TGCAAATTA", "AAAGGGCCCTTT", "TGCGATACGTAGGACCA", "ACTCATTAGTGC", "AAACGCTAGACACACAAG"})
			cancerSequences.add(sequence);

		assertTrue(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "TGC"));
		assertFalse(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "GGG"));
	}

}