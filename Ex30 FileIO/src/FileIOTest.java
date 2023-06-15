import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//파일 복사 프로그렘 제작
		
		//원본파일의 경로와 파일명.확장자
		String srcPath="D:/files/aaa.txt";
		
		//원본 파일과 연결하는하는 무지개로드(InputStream) 생성
		try {
			FileInputStream fis=new FileInputStream(srcPath);
			
		    //읽어들인 파일의 데이터를 곧바로 다른 파일에 내보내기 위해
			//새로 만들어진 파일의 저장경로부터 만들기
			File path=new File("D:/copy");
			if(!path.isDirectory()) path.mkdirs();
			
			//저장될 경로와 파일명.확장자 를 결합
			File dstFile=new File(path,"bbb.txt");
			
			//위 만들어진 파일에 저장하기 위해 연결하는 무지개로드 만들기
			FileOutputStream fos=new FileOutputStream(dstFile);
			
			//원본파일 (aaa.txt)에서 데이터를 1바이트씩 반복적으로 읽어오면서
			//바로바로 목적지파일(bbb.text)에 1바이트씩 내보내기(저장)
			while(true) {
				byte b=(byte)fis.read();
				if(b==-1)break;
				
				
				fos.write(b);
			}
			
			//스트림을 통해 write()할때 ..찌꺼기가 남을 수 있기에
			fos.flush();
			
			//복사 종료되었으니 스트림 닫기
			fis.close();
			fos.close();
			
			
			System.out.println("복사가 완료 되었 습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("복사중 오류가 발생");
		}

	}

}
