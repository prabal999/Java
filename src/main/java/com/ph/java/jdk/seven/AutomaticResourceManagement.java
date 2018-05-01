package com.ph.java.jdk.seven;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Resources such as Connections, Files, Input/OutStreams, etc. should be closed
 * manually by the developer by writing bog-standard code. Usually we use a
 * try-finally block to close the respective resources.
 * 
 * @author Prabal
 *
 */
public class AutomaticResourceManagement {

	private static final String fileName = "tryBlock.txt";
	public static void main(String[] args) {
		File tempFile = new File(fileName);
		AutomaticResourceManagement arm = new AutomaticResourceManagement();
		System.out.println(tempFile.getAbsolutePath());
		arm.oldTry();
		arm.newTry();
		if(tempFile.exists()) {
			tempFile.delete();
		}
	}

	public void oldTry() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			dos.writeUTF("Java 7 Block Buster");
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fos.close();
				dos.close();
			} catch (IOException e) {
				// log the exception
			}
		}
	}

	/**
	 * The FileOutputStream and DataOutputStream resources are enclosed in the try
	 * statement one after the other, each one separated by a semicolon (;)
	 * separator. We do not have to nullify or close the streams manually, as they
	 * are closed automatically once the control exists the try block.
	 * 
	 * Behind the scenes, the resources that should be auto closed must implement
	 * java.lang.AutoCloseable interface.
	 * 
	 * Any resource that implements AutoCloseble interface can be a candidate for
	 * automatic resource management. The AutoCloseable is the parent of
	 * java.io.Closeable interface and has just one method close() that would be
	 * called by the JVM when the control comes out of the try block.
	 * 
	 */
	public void newTry() {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("Java 7 Block Buster");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
