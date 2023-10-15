package com.example.headline_log.service;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class LoggingRunner implements ApplicationRunner{

	private Logger logger = LoggerFactory.getLogger(LoggingRunner.class);
	Path currentWorkingDir = Paths.get("").toAbsolutePath();
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		logger.trace(currentWorkingDir.toString());
		logger.debug(currentWorkingDir.toString());
		logger.info(currentWorkingDir.toString());
		logger.warn(currentWorkingDir.toString());
		logger.error(currentWorkingDir.toString());
		
	}
}
