package com.gofortrainings.traveller.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables=Resource.class)
public class Services {

	@ValueMapValue
	private String image1;
	@ValueMapValue
	private String text1;
	
	@ValueMapValue
	private String image2;
	@ValueMapValue
	private String text2;

	@ValueMapValue
	private String image3;
	@ValueMapValue
	private String text3;

	@ValueMapValue
	private String image4;
	@ValueMapValue
	private String text4;
	public String getImage1() {
		return image1;
	}
	public String getText1() {
		return text1;
	}
	public String getImage2() {
		return image2;
	}
	public String getText2() {
		return text2;
	}
	public String getImage3() {
		return image3;
	}
	public String getText3() {
		return text3;
	}
	public String getImage4() {
		return image4;
	}
	public String getText4() {
		return text4;
	}

}
