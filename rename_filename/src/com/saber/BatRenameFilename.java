package com.saber;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class BatRenameFilename {
	// public static void main(String[] args) {
	// File srcFolder = new File("D:\\New");
	//
	// File[] fileStr = srcFolder.listFiles();
	// for (File f: fileStr) {
	// if (f.isFile()) {
	// if (f.getName().endsWith(".jpg")) {
	// System.out.println(f.getName());
	// }
	// }
	// }
	// }

	// �ļ����ƹ�����
	// public static void main(String[] args) {
	// File srcFolder = new File("D:\\New");
	// String[] strArray = srcFolder.list(new FilenameFilter() {
	//
	// @Override
	// public boolean accept(File dir, String name) {
	// File f = new File(dir, name);
	//
	// return f.isFile() && f.getName().endsWith(".jpg");
	// }
	// });
	//
	// for (String s : strArray) {
	// System.out.println(s);
	// }
	// }
	// Demo �����޸ı����ļ���

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
