/**
 * @author liuze
 *
 * Feb 17, 2014
 */
package com.jt.research.hadoop.basic;

import java.io.InputStream;
import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

public class CommonJavaConnect {
	
	private final static String url = "hdfs://hadoop1:9000/hello";
	
	public static void main(String[] args) throws Exception {
		URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
		final URL url2 = new URL(url);
		final InputStream openStream = url2.openStream();
		IOUtils.copyBytes(openStream, System.out, 1024, true);
	}

}
