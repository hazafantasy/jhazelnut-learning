package com.jhazelnut.jhlearning.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "JhlStatusResponse")
public class JhlStatusRestResponseBean {
	private String content;
	
	public JhlStatusRestResponseBean(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
}
