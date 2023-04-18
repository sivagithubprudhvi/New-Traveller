package com.gofortrainings.traveller.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Grid2 {
@ValueMapValue
private String heading3;
@ChildResource
 List<Grid2Child2> fc3;
public String getHeading3() {
	return heading3;
}
public List<Grid2Child2> getFc3() {
	return fc3;
}


}