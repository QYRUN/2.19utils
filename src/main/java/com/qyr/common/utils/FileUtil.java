package com.qyr.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileUtil {
	public static void writeFile(String path, String content, String charset) throws IOException {
		// ����д����ļ�
		File file = new File(path);
		// �жϸ�Ŀ¼�Ƿ����
		if (!file.getParentFile().exists()) {
			// ������Ŀ¼
			file.getParentFile().mkdirs();
		}
		// �������������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
		bw.write(content);
		bw.flush();
		bw.close();
	}

	/**
	 * @Title: readFile
	 * @Description: ��ȡ�ļ�����
	 * @param file
	 * @param charset
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readFile(File file, String charset) throws IOException {
		// �������������
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
		// ���建�����
		StringBuffer sb = new StringBuffer();
		// �����ȡÿ�еĽ��
		String content = null;
		// ѭ����ȡ
		while ((content = br.readLine()) != null) {
			// ���뻺�����
			sb.append(content);
		}
		// �ر���
		br.close();
		// ���ؽ��
		return sb.toString();

	}
}
