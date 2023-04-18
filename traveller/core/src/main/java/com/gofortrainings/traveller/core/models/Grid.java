package com.gofortrainings.traveller.core.models;


import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Grid {
@ValueMapValue
private String heading1;

@ChildResource
List<GridChild> fc1;

public String getHeading1() {
	return heading1;
}

public List<GridChild> getFc1() {
	return fc1;
}
}
