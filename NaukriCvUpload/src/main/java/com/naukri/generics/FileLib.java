package com.naukri.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * This is a generic class for data driven testing
 * @author user
 *
 */
public class FileLib {
	/**
	 * Reading data from property file.
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String getPropertyValue(String key) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
	
	/**
	 * Getting the path of resume
	 * @return path
	 */
	public String resumePath() {
		File f = new File("./src/test/resources/data/resume.docx");
		String path=f.getAbsolutePath();
		return path;
	}
 }

