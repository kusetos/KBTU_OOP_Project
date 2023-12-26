package Comparators;

import java.util.Comparator;

import ResearcherStuff.ResearchPaper;

public class PaperPageComparator implements Comparator<ResearchPaper>{

	@Override
	public int compare(ResearchPaper o1, ResearchPaper o2) {

		return o1.getPages() - o2.getPages();
	}

}
