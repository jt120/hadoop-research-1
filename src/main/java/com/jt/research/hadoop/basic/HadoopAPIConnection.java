/**
 * @author liuze
 *
 * Feb 17, 2014
 */
package com.jt.research.hadoop.basic;

import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopAPIConnection {
	
	private final static String uri = "hdfs://hadoop1:9000/";
	private final static String PATH = "/d100";
	
	public static void main(String[] args) throws Exception {
		final FileSystem fileSystem = FileSystem.get(new URI(uri), new Configuration());
		fileSystem.mkdirs(new Path(PATH));
	}

}
