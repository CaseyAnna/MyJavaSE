package com.saber;

import java.io.File;

public class BatRenameFilename {

	public static void main(String[] args) {
		File srcFolder = new File("D:\\New");

		File[] fileArray = srcFolder.listFiles();

		int i = 1; 
		for (File f:fileArray) {
			if (f.isFile() && (f.getName().endsWith(".jepg"))) {
				String newName = "IMG_0" + i + ".jpg";
				File newFile = new File(srcFolder, newName);
				f.renameTo(newFile);
				i++;
				System.out.println(i + "--" + newFile.getName());
			}
		}

	}
}
