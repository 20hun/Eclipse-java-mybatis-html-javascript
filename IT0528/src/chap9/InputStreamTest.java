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
			
			//무한루프 주의점 빠져나갈 코드 있어야한다!!
			while(true) {
				data = fis.read(); //1바이트 읽고 그걸 데이터로 전달
				//data의 값이 -1인 경우는 파일에서 데이터를 읽었는데 데이터 없는 경우
				//eof라고 함 -> end of file
				if(data == -1) {
					break;
				}
				fos.write(data);
				
				System.out.print((char)data); //유니코드 값이 넘어와서 형변환
		}
		}catch(FileNotFoundException e) { //13번째줄 에러 가능
			e.printStackTrace();
		}catch(IOException e) { // 18에서 날 수 있는 에러
			//어떤 문제(인터넷 나간다던가) 생길지 몰라 해주는 것이 IOException
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
