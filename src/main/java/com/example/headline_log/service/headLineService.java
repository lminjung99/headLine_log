package com.example.headline_log.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.headline_log.dto.headLineEntity;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class headLineService {
	
	public List<headLineEntity> getHeadLine() throws StreamReadException, DatabindException, IOException{
		ObjectMapper objectMapper = new ObjectMapper();
	
		String absolutePath = "/home/ubuntu";
		String filePath = absolutePath+"/trend_topic.json";
		
		List<headLineEntity> headLineList = objectMapper.readValue(new File(filePath),
				new TypeReference<List<headLineEntity>>() {
			
		});
		
		
		return headLineList;
}
}
