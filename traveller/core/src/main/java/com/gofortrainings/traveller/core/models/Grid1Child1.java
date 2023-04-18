package com.gofortrainings.traveller.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Grid1Child1 {

	@ValueMapValue
	private String text2;

	public String getText2() {
		return text2;
	}

	
}