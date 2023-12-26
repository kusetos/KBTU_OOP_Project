package Comparators;

import java.util.*;

import ResearcherStuff.ResearchPaper;

public class PaperDatePublishComparator implements Comparator<ResearchPaper>{

	public int compare(ResearchPaper o1, ResearchPaper o2) {
		// TODO Auto-generated method stub
		return o1.getDatePublished().compareTo(o2.getDatePublished());
	}

}
