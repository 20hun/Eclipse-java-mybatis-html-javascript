package chap9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("song.txt");
			fos = new FileOutputStream("copySong.txt");
			int data;
			
			//���ѷ��� ������ �������� �ڵ� �־���Ѵ�!!
			while(true) {
				data = fis.read(); //1����Ʈ �а� �װ� �����ͷ� ����
				//data�� ���� -1�� ���� ���Ͽ��� �����͸� �о��µ� ������ ���� ���
				//eof��� �� -> end of file
				if(data == -1) {
					break;
				}
				fos.write(data);
				
				System.out.print((char)data); //�����ڵ� ���� �Ѿ�ͼ� ����ȯ
		}
		}catch(FileNotFoundException e) { //13��°�� ���� ����
			e.printStackTrace();
		}catch(IOException e) { // 18���� �� �� �ִ� ����
			//� ����(���ͳ� �����ٴ���) ������ ���� ���ִ� ���� IOException
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
