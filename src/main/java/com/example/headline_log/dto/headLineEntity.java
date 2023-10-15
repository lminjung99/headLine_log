package com.example.headline_log.dto;

import java.util.List;

public class headLineEntity {
	private String date;
	private String topic_year;
	private String topic_day;
	private String topic_sort;
	private List<headLineList> topic_list;
	private String topic_category;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTopic_year() {
		return topic_year;
	}
	public void setTopic_year(String topic_year) {
		this.topic_year = topic_year;
	}
	public String getTopic_day() {
		return topic_day;
	}
	public void setTopic_day(String topic_day) {
		this.topic_day = topic_day;
	}
	public String getTopic_sort() {
		return topic_sort;
	}
	public void setTopic_sort(String topic_sort) {
		this.topic_sort = topic_sort;
	}
	public List<headLineList> getTopic_list() {
		return topic_list;
	}
	public void setTopic_list(List<headLineList> topic_list) {
		this.topic_list = topic_list;
	}
	public String getTopic_category() {
		return topic_category;
	}
	public void setTopic_category(String topic_category) {
		this.topic_category = topic_category;
	}
	@Override
	public String toString() {
		return "headLineEntity [date=" + date + ", topic_year=" + topic_year + ", topic_day=" + topic_day
				+ ", topic_sort=" + topic_sort + ", topic_list=" + topic_list + ", topic_category=" + topic_category
				+ "]";
	}
	
	
	
}
