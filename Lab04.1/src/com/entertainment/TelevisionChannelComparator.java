package com.entertainment;

import java.util.Comparator;

public class TelevisionChannelComparator implements Comparator<Television> {

	@Override
	public int compare(Television tv1, Television tv2) {
		// this takes in a list of TVs and returns them in a sorted order
		return Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
	}

}
