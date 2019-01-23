package corelesson4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RWDemo1 {
	public static void main(String[] args) {
		try {
			//			InputStreamReader in = new InputStreamReader(
			//					new FileInputStream(
			//							"C:\\Users\\Jonathan Hsu\\Documents\\2.txt"));
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/data.txt"),
					"UTF-16");
			//data.txt 是 UniCode 編碼
			OutputStreamWriter out = new OutputStreamWriter(
					new FileOutputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/data1.txt"));
			/*int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
				out.flush(); //字符流都帶有緩衝區
			}*/
			int chars;
			char[] c = new char[1000];
			while ((chars = in.read(c, 0, c.length)) != -1) {
				String s = new String(c, 0, chars);
				System.out.print(s);
				out.write(c, 0, chars);
				out.flush();
			}
			in.close();
			out.close();
		} catch (Exception e) {
		}
	}
}
