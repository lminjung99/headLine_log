package com.example.headline_log.dto;

public class headLineList {
	
	private String topic_sn;
	private String topic_text;
	private String topic_count;
	
	public String getTopic_sn() {
		return topic_sn;
	}
	public void setTopic_sn(String topic_sn) {
		this.topic_sn = topic_sn;
	}
	public String getTopic_text() {
		return topic_text;
	}
	public void setTopic_text(String topic_text) {
		this.topic_text = topic_text;
	}
	public String getTopic_count() {
		return topic_count;
	}
	public void setTopic_count(String topic_count) {
		this.topic_count = topic_count;
	}
	
	@Override
	public String toString() {
		return "headLineList [topic_sn=" + topic_sn + ", topic_text=" + topic_text + ", topic_count=" + topic_count
				+ "]";
	}
	
	
}
