package com.gofortrainings.traveller.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Grid1 {
@ValueMapValue
private String heading2;

@ChildResource
List<Grid1Child1> fc2;

public String getHeading2() {
	return heading2;
}

public List<Grid1Child1> getFc2() {
	return fc2;
}



}

