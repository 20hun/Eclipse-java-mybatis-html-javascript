package chap9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("396a19eacc38becae6b7ece4069dbceef291ddc805b3c8b3505588ded1d414eb_v1.jpg");
			fos = new FileOutputStream("copyImage.jpg");
			
			int count;
			byte[] buffer = new byte[50]; //50����Ʈ�� ����
			
			while(true) {
				//byte[]�� �Ű������� ����� read() �޼ҵ�� ���� �������� ũ�⸦ ��ȯ
				count = fis.read(buffer); //�󸶸�ŭ �о������� ����
				
				if(count < buffer.length) {//�� ������ �����͸� �о��� ��
					for(int i = 0; i<count; i++) {
						fos.write(buffer[i]);
					}
					break;
				}
				fos.write(buffer);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("File Copy Complete!");

	}

}
