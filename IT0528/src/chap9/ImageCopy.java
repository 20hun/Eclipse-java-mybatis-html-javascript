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
			byte[] buffer = new byte[50]; //50바이트씩 읽자
			
			while(true) {
				//byte[]을 매개변수로 사용한 read() 메소드는 읽은 데이터의 크기를 반환
				count = fis.read(buffer); //얼마만큼 읽었는지를 리턴
				
				if(count < buffer.length) {//맨 마지막 데이터를 읽었을 것
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
